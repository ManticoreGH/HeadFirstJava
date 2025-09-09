import java.io.*;

public class Pond implements Serializable{
    private Duck duck = new Duck();
    public static void main(String[] args) throws Exception {
        Pond myPond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch (Exception ex) {
            System.out.println("Error occurred during serialization: " + ex.getMessage());
        }
    }
}
