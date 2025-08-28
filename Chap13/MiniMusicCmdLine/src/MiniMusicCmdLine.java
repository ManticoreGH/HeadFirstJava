import javax.sound.midi.*; // Importation des classes MIDI

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine(); // Création d'une instance de la classe
        if (args.length < 2) { // Vérifie la présence des deux arguments requis
            System.out.println("Don't forget the instrument and note args"); // Message d'erreur si arguments manquants
        } else {
            int instrument = Integer.parseInt(args[0]); // Conversion du premier argument en instrument MIDI
            int note = Integer.parseInt(args[1]); // Conversion du second argument en note MIDI
            mini.play(instrument, note); // Appel de la méthode pour jouer la note
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer(); // Obtention du séquenceur MIDI
            player.open(); // Ouverture du séquenceur
            Sequence seq = new Sequence(Sequence.PPQ, 4); // Création d'une séquence MIDI
            Track track = seq.createTrack(); // Création d'une piste dans la séquence

            // Création d'un message pour changer l'instrument
            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(ShortMessage.PROGRAM_CHANGE, 1, instrument, 0); // Définit l'instrument MIDI
            MidiEvent changeInstrument = new MidiEvent(msg1, 1); // Crée l'événement de changement d'instrument
            track.add(changeInstrument); // Ajoute l'événement à la piste

            // Création d'un message pour jouer la note
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(ShortMessage.NOTE_ON, 1, note, 100); // Définit le message "note on"
            MidiEvent noteOn = new MidiEvent(msg2, 1); // Crée l'événement "note on"
            track.add(noteOn); // Ajoute l'événement à la piste

            // Création d'un message pour arrêter la note
            ShortMessage msg3 = new ShortMessage();
            msg3.setMessage(ShortMessage.NOTE_OFF, 1, note, 100); // Définit le message "note off"
            MidiEvent noteOff = new MidiEvent(msg3, 16); // Crée l'événement "note off" à la position 16
            track.add(noteOff); // Ajoute l'événement à la piste

            player.setSequence(seq); // Charge la séquence dans le séquenceur
            player.start(); // Démarre la lecture de la séquence
        } catch (Exception ex) {
            ex.printStackTrace(); // Affiche la trace de l'exception en cas d'erreur
        }
    }
}