public class Main {
    public static void main(String[] args) {
        double d = 42.5;
        
        // Most efficient method - directly use Double.toString()
        String doubleString = Double.toString(d);
        
        // Alternative using String.valueOf() (internally calls Double.toString())
        String valueOfString = String.valueOf(d);
        
        // Demonstrate the methods in a single output for better performance
        System.out.println("Double.toString(): " + doubleString);
        System.out.println("String.valueOf(): " + valueOfString);
        System.out.println("Direct in println: " + d); // Most efficient for display only
    }
}