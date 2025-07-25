public class Surgeon extends Doctor {
    @Override
    public void treatPatient() {
        System.out.println("Perform surgery.");
    }
    
    void makeIncision() {
        System.out.println("Make an incision.(Yikes!)");
    }
    
}
