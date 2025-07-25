public class DoctorTestDrive {
    public static void main(String[] args) throws Exception {
        Doctor d = new Doctor();
        d.treatPatient(); // Output: Perform treatment.

        Surgeon s = new Surgeon();
        s.treatPatient(); // Output: Perform surgery.
        s.makeIncision(); // Output: Make an incision.(Yikes!)

        FamilyDoctor f = new FamilyDoctor();
        f.giveAdvice(); // Output: Give homespun advice.
    }
}
