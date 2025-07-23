public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++) {
            for(int inner = 4; inner > 1; inner--) {
                /* x += 3;
                 * Result: 54 6
                 * x+= 6;
                 * Result: 60 10
                 * x += 2;
                 * Result: 45 6
                 * x++
                 * Result: 36 6
                 * x--
                 * Result: 18 6
                 * x += 0
                 * Result: 6 14
                 */
                x += 0;
                
                y -= 2;
                if(x == 6) {
                    break;
                }
                x += 3;
            }
            y -= 2;          
        }
        System.out.println(x + " " + y);
    }
}
