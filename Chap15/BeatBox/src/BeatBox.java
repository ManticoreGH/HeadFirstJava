
import java.awt.*;
import java.util.ArrayList;
import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;
import javax.swing.*;

public class BeatBox {

    private ArrayList<JCheckBox> checkboxList; // We store checkboxes in an ArrayList
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    /*
     * Names of instruments to be displayed in the GUI
     */
    String[] instrumentNames = {
            "Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare",
            "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo",
            "Maracas", "Whistle", "Low Conga", "Cowbell",
            "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"
    };
    /*
     * These represent the actual drum "keys". The drum channel is like a piano,
     * except each "key" on the piano is a different drum. So the number "35"
     * is the key for the Bass Drum, 42 is Closed Hi-Hat, etc.
     */
    int[] instruments = {
            35, 42, 46, 38, 49, 39, 50, 60,
            70, 72, 64, 56, 58, 47, 67, 63
    };

    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        new BeatBox().buildGUI();
    }

    private void buildGUI() {
        JFrame frame = new JFrame("Cyber BeatBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        /*
         * An "empty border" gives us a margin between of the panel and where the
         * components are placed.
         * Purely aesthetic.
         */
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(e -> buildTrackAndStart());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> sequencer.stop());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        /* Lambda expressions are perfect for these buttons are pressed, all we want to
        do is call a specific method.
        The default tempo is 1.0f, so we're adjusting +/- 3% per click. */
        upTempo.addActionListener(e -> changeTempo(1.03f));
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(e -> changeTempo(0.97f));
        buttonBox.add(downTempo);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (String instrumentName : instrumentNames) {
            JLabel instrumentLabel = new JLabel(instrumentName);
            /// This border on each instrument name helps them line up with the checkboxes
            instrumentLabel.setBorder(BorderFactory.createEmptyBorder(4, 1, 4, 1));
            nameBox.add(instrumentLabel);
        }
        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        frame.getContentPane().add(background);
        /** 
         * Another layout manager, this one lets you put components in a grid with rows
         * and columns.
         */
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);

        JPanel mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        checkboxList = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }
        setUpMidi();

        frame.setBounds(50, 50, 300, 300);
        frame.pack();
        frame.setVisible(true);
    }

    private void setUpMidi() {
        /**
         * The usual Midi setup stuff for getting a Sequencer, the Sequence,
         * and the Track. Again, nothing special.
         */
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        /**
         * We'll make a 16-element array to hold the values for one instrument,
         * across all 16 beats. If the instrument is supposed to play on that beat, the
         * value at that element, will be the key. If that instrument is NOT supposed to
         * play
         * on that beat, put in a zero.
         */
        int[] trackList;

        // Get rid of the old track, make a fresh one
        sequence.deleteTrack(track);
        track = sequence.createTrack();
        // Do this for each of the BEATS for this row
        for (int i = 0; i < 16; i++) {
            /**
             * Is the checkbox at this beat selected?
             * If yes, put the key value in this slot in the array (The slot that represents
             * this beat).
             * Otherwise, the instrument is NOT supposed to play at this beat, so set it to
             * zero.
             */
            trackList = new int[16];
            int key = instruments[i];
            for (int j = 0; j < 16; j++) {
                JCheckBox jc = checkboxList.get(j + (16 * i));
                if (jc.isSelected()) {
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            }
            makeTracks(trackList); // For this instrument, and for all 16 beats, make events and add then to the
                                   // track.
            track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, 16));
        }
        /**
         * We always want to make sure that there IS an event at beat 16 (it goes 0 to
         * 15).
         * Otherwise the BeatBox might not go the full 16 beats before it starts over.
         */
        track.add(makeEvent(PROGRAM_CHANGE, 9, 1, 0, 15));
        try {
            sequencer.setSequence(sequence);
            // Lets you specify the number of loop iterations, or in this case, continuous
            // looping.
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
            sequencer.start();// Now play the thing.
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    /**
     * The Tempo Factor scales the sequencer's tempo by the factor provided, slowing
     * the beat down or speeding it up.
     * 
     * @param tempoMultiplier
     */
    private void changeTempo(float tempoMultiplier) {
        float tempoFactor = sequencer.getTempoFactor();
        sequencer.setTempoFactor(tempoFactor * tempoMultiplier);
    }

    /**
     * This makes events for one instrument at a time, for all 16 beats. 
     * So it might get an int[] for the bass drum, and each insdex in the array 
     * will hold either the key of that instrument or a zero. If it's a zero, 
     * the instrument isn't supposed to play at that beat.
     * Otherwise, make an event and add it to the track.
     * @param list
     */
    private void makeTracks(int[] list) {
        for (int i = 0; i < 16; i++) {
            int key = list[i];
            if (key != 0) {
                // Make the NOTE ON and NOTE OFF events, and add them to the track.
                track.add(makeEvent(NOTE_ON, 9, key, 100, i));
                track.add(makeEvent(NOTE_OFF, 9, key, 100, i + 1));
            }
        }
    }
    /**
     * A utility method to make it easier to add events to the track.
     * 
     * @param cmd  the command for the event
     * @param chnl the channel
     * @param one  the first data value
     * @param two  the second data value
     * @param tick the beat (position) on which to insert the event
     * @return a MidiEvent object
     */
    private MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, chnl, one, two);
            event = new MidiEvent(msg, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

}
