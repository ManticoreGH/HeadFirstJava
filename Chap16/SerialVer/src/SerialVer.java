import java.io.*;

public class SerialVer {
    public static void main(String[] args) {
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            os = new FileOutputStream("dog.ser");
            oos = new ObjectOutputStream(os);
            Dog dog = new Dog("Buddy", 10);
            oos.writeObject(dog);
            System.out.println("Dog object serialized successfully.");
            ois = new ObjectInputStream(new FileInputStream("dog.ser"));
            Dog deserializedDog = (Dog) ois.readObject();
            System.out.println("Deserialized Dog: " + deserializedDog);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
                if (oos != null) oos.close();
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
