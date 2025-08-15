public class Main {
    public static void main(String[] args) {
        String s = "2";
        int x = Integer.parseInt(s);
        double d = Double.parseDouble("420.24");
        boolean b = Boolean.parseBoolean("true"); // returns true if the string is "true" (case-insensitive)
        //String t = "two";
        String t = "2";
        int y = Integer.parseInt(t); // This will throw NumberFormatException the string should be "2"
        // or similar numeric string but not "two"
        System.out.println("Integer x: " + x);
        System.out.println("Double d: " + d);
        System.out.println("Boolean b: " + b);
        System.out.println("Integer y: " + y);
    }
}