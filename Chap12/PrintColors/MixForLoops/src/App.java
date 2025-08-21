import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        String output = "";
        for (int i = 1; i < nums.size(); i++) {
            output += nums.get(i) + " ";
        }
        System.out.println(output.trim());
        //Output: 2 3 4 5
        output = "";
        for (Integer num : nums){
            output += nums + " ";
        }
        System.out.println(output.trim());
        //Output: [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5]
        /* output = "";
        for(int i = 0; i <= nums.size(); i++) {
            output += nums.get(i) + " ";
        } */
        System.out.println(output.trim());
        //Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        output = "";
        for (int i = 0; i <= nums.size(); i++) {
            output += nums.get(i) + " ";
        }
        System.out.println(output.trim());

    }
}
