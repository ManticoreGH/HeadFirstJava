import static java.lang.Integer.valueOf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 288;
        Integer iWrap = i; // Autoboxing: int to Integer
        int unWrapped = iWrap.intValue(); // Unboxing: Integer to int
        System.out.println("i = " + i);
        System.out.println("iWrap = " + iWrap);
        System.out.println("unWrapped = " + unWrapped);

    }
}