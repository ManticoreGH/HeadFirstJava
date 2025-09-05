import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MinimusicPlayer1 {
    public static void main(String[] args) {
        try {
            // Make and open a sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            // Make a sequence and a track
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            // Make a bunch of events to make the notes keep going up (from piano note 5 to 61)
            for (int i = 5; i <= 61; i += 4) {
                /*
                 * Call our new makeEvent method
                 * to make the message and event; then add the result
                 * (the midiEvent returned by makeEvent) to the track.
                 * These are NOTE_ON and NOTE_OFF pairs.
                 */
                track.add(makeEvent(NOTE_ON, 1, i, 100, i));
                track.add(makeEvent(NOTE_OFF, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick){
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