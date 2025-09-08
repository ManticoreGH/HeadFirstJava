/**
 * Serializable is in the java.io package, so we need to import it
 */
import java.io.*;

/**
 * No methods to implement, but when you say "implements Serializable", it says to the
 * Java Virtual Machine, "it's OK to serialize objects of this type."
 */
public class Square implements Serializable {
    /**
     * These two values will be saved
     */
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) throws Exception {
        Square mySquare = new Square(50, 20);
        /**
         * I/O operations can throw exceptions.
         */
        try {
            // Connect to a file named "foo.ser"
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(mySquare);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
