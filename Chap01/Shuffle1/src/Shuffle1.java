public class Shuffle1 {
    public static void main(String[] args) throws Exception {
        int x = 3;
        if (x > 2) {
            System.out.print('a');
        }
        while (x > 0) {
            x--;
            System.out.print('-');
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1){
                System.out.print('d');
                System.out.print('\n');
                x--;
            }
        }
    }
}
