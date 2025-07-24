import java.util.Scanner;

public class GameHelper {
  private final Scanner scanner;
  
  public GameHelper() {
    scanner = new Scanner(System.in);
  }
  
  public int getUserInput(String prompt) {
    System.out.print(prompt + ": ");
    return scanner.nextInt();
  }
  
  public void close() {
    if (scanner != null) {
      scanner.close();
    }
  }
}