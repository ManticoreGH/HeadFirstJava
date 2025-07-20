public class App {
    public static void main(String[] args) throws Exception {
        int x = 3;
        if (x == 3) System.out.println("x must be 3");
        System.out.println("This runs no matter what");

        //else branching
        x = 2;
        if (x == 3) System.out.println("x must be 3");
        else {
            System.out.println("x is not 3");
        }
        System.out.println("This runs no matter what");
    }
}
