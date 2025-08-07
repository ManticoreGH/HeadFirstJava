//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Hippo h = new Hippo();
        Duck d = new Duck(5);
        Hippo h2 = new Hippo("Buffy");
        System.out.println(h2.getName());
    }
}