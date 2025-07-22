/**
 * i < 9 index < 5
 * Result: 14 1
 * 
 * i < 20 index < 5
 * Result: 25 1
 * 
 * i < 7 index < 7
 * Result: 14 1
 * 
 * i < 19 index < 1
 * Result: 20 1
 */

public class Mix4 {
    int counter = 0;
    public static void main(String[] args) throws Exception {
        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while (i < 19) {
            mixes[i] = new Mix4();
            mixes[i].counter++;
            count++;
            count = count + mixes[i].maybeNew(i);
            i++;
        }
        System.out.println(count + " " + mixes[1].counter);
    }
    public int maybeNew(int index) {
        if (index < 1) {
            Mix4 mix = new Mix4();
            mix.counter++;
            return 1;
        } else {
            return 0;
        }
    }
}
