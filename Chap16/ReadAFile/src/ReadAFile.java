import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAFile {
    public static void main(String[] args) throws Exception {
        try {
            File myFile = new File("MyText.txt");
            // A file reader is a connection stream for characters that connects to a text file
            FileReader fileReader = new FileReader(myFile);
            /* 
             * Chain the FileReader to a BufferedReader
             * for more efficient reading. It'll go back to the file
             * to read only when the buffer is empty 
             * (because the program has read everything in it).
             */
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            /*
             * This says, 
             * "Read a line of text, and assign it to the String variable "line".
             * While that variable is not null (because there WAS something to read),
             * print out the line that was read."
             * Or another way of saying it, "While there are still lines to read,
             * read them and print them."
             */
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            // A more concise way to write the above while loop:
            Files.lines(Path.of("MyText.txt")).forEach(l -> System.out.println(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
