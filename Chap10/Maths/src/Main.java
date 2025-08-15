//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = Math.abs(-240);
        double d = Math.abs(240.45);
        System.out.println("Absolute value of -240: " + x);
        System.out.println("Absolute value of 240.45: " + d);
        // The Math.abs() method returns the absolute value of a number.
        // It can be used with both integers and floating-point numbers.
        // The absolute value is the non-negative value of a number without regard to its sign.
        // For example, the absolute value of -240 is 240, and the absolute value
        // of 240.45 is 240.45.

        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);
        System.out.println("Random double: " + r1);
        System.out.println("Random integer between 0 and 4: " + r2);
        // The Math.random() method returns a double value greater than or equal to 0.
        // and less than 1. It can be used to generate random numbers.
        // To generate a random integer within a specific range, you can multiply
        // the result of Math.random() by the range size and cast it to an integer.
        // In this case, we multiply by 5 to get a random integer between 0
        // and 4 (inclusive). The cast to int truncates the decimal part,
        // effectively giving us a random integer in the desired range.

        int x2 = Math.round(-24.8f);
        int y = Math.round(24.45f);
        long z = Math.round(24.45);
        System.out.println("Rounded value of -24.8: " + x2);
        System.out.println("Rounded value of 24.45 (float): " + y);
        System.out.println("Rounded value of 24.45 (double): " + z);
        // The Math.round() method is used to round a floating-point number to the nearest integer
        // value. It can be used with both float and double types.

        int x3 = Math.min(24,240);
        double y2 = Math.min(90876.5, 90876.45);
        System.out.println("Minimum of 24 and 240: " + x3);
        System.out.println("Minimum of 90876.5 and 90876.45: " + y2);
        // The Math.min() method returns the smaller of two values.
        // It can be used with both integers and floating-point numbers.

        int x4 = Math.max(24,240);
        double y3 = Math.max(90876.5, 90876.45);
        System.out.println("Maximum of 24 and 240: " + x4);
        System.out.println("Maximum of 90876.5 and 90876.45: " + y3);
        // The Math.max() method returns the larger of two values.
        // It can be used with both integers and floating-point numbers.

        double x5 = Math.sqrt(9);
        double y4 = Math.sqrt(42.0);
        System.out.println("Square root of 9: " + x5);
        System.out.println("Square root of 42.0: " + y4);
        // The Math.sqrt() method returns the square root of a number.
        // It can be used with both integers and floating-point numbers.

    }
}