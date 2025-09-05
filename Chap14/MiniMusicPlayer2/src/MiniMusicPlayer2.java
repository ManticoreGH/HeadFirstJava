import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer2 {
    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    private void go() {
        try {
            Sequencer sequencer =  MidiSystem.getSequencer();
            sequencer.open();
            /*
            * Register for events with the sequencer. The event registration method takes the
            * listener AND an int array representing the list of ControllerEvents you want We want care about one event,
            * #127.
            * */
            int[] eventsIWant = {127};
            /*
            * Each time whe get the event, we'll print "la" to the command line. We're using a lambda
            *   expression here to handle this ControlerEvent.
            *  */
            sequencer.addControllerEventListener(event -> System.out.println("la"), eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 60 ; i+=4) {
                /*
                * Here's how we pick up the beat-we insert our OWN ControlerEvent (CONTROL_CHANGE)
                * with an argument of event #127. This event will do NOTHING! We put it in JUST so
                * that we can get an event each time note is played. In other words, its sole purpose
                * is so that something will fire that WE can listen for (we can't listen for NOTE_ON/OFF events).
                * We're making this event happen at the SAME tick as the NOTE_ON. So when the NOTE_ON event
                * happens, we'll know about it because OUR event will fire at the same time.
                * */
                track.add(makeEvent(NOTE_ON, 1, i, 100, i));
                track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, i));
                track.add(makeEvent(NOTE_OFF, 1, i, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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