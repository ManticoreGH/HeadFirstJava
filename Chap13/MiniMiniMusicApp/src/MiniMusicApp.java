import javax.sound.midi.*; // Import the midi package
import static javax.sound.midi.ShortMessage.*; // Static import for accessing constant in ShortMessage class

public class MiniMusicApp {
    public static void main(String[] args) throws Exception {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer(); // Get a sequencer
            player.open(); // Open the sequencer
            Sequence seq = new Sequence(Sequence.PPQ, 4); 
            Track track = seq.createTrack(); // Ask the Sequence for a Track lives in the Sequence,
            // and the MIDI data lives in the Track.
            /**
             * Put some MidiEvents into the Track. This part is mostly Ready-Bake Code.
             * The only thing you'll have to the setMessage() method, and the arguments to 
             * the MidiEvent constructor. We'll look at those arguments on the next page.
             */
            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);

            player.setSequence(seq); // Give the Sequence to the Sequencer (like selecting a song to play)
            player.start(); // Start the Sequencer (play the song).

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
