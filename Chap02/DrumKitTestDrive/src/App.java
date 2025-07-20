class DrumKit {
    // DrumKit class implementation
    boolean topHat = true;
    boolean snare = true;
    public void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    public void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
       DrumKit d = new DrumKit();
       d.playSnare();
       d.snare = false; // Disable snare
       d.playTopHat(); // Play top hat
       if (d.snare == true) {
           d.playSnare(); // This won't play since snare is disabled
       } 
    }
}
