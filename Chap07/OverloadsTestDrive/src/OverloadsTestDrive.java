public class OverloadsTestDrive {
    public static void main(String[] args) throws Exception {
        Overloads overloads = new Overloads();
        System.out.println("Adding integers: " + overloads.addNums(5, 10));
        System.out.println("Adding doubles: " + overloads.addNums(5.5d, 10.3d));
        overloads.setUniqueID("123-45-6789");
        System.out.println("Unique ID set to: " + overloads.uniqueID);
        overloads.setUniqueID(987654321);
        System.out.println("Unique ID set to: " + overloads.uniqueID);
    }
}
