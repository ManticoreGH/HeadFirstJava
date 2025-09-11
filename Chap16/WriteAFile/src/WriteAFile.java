import java.io.*;

public class WriteAFile {
    public static void main(String[] args) throws Exception {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
