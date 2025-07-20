public class Test {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 0;
        while (x < 5) {
            /* 00 11 21 31 42
             *    y = x - y; 
             */
            
            /* 00 11 23 36 410
             * y += x;
             */
            
            /*
             * 02 14 25 36 47
             * y += 2;
             * if(y > 4){
             *  y--;
             * }
             */
            
            /*
            * 11 34 59
            * x++;
            * y += x;
            */            
            
            /*
             * 02 14 36 48
             */
            if (y < 5){
                x++;
                if (y < 3){
                    x--;
                } 
            }
            y += 2;
            System.out.print(x + "" + y + " ");
            x++;
        }
        System.out.print('\n');
    }
}
