package FormatingString;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        int x = 32;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x); // Auto-boxing: int to Integer
        int num = list.get(0); // Auto-unboxing: Integer to int
        System.out.println("The number is: " + num);
    }
}