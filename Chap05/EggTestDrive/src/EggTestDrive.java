
import java.util.ArrayList;

class Egg{

}
public class EggTestDrive {
    public static void main(String[] args) throws Exception {
        ArrayList<Egg> myList = new ArrayList<>();
        Egg egg1 = new Egg();
        myList.add(egg1);
        Egg egg2 = new Egg();
        myList.add(egg2);
        int theSize = myList.size();
        System.out.println("The size of myList is: " + theSize);
        boolean isIn = myList.contains(egg1);
        System.out.println("Is egg1 in myList? " + isIn);
        int idX = myList.indexOf(egg2);
        System.out.println("The index of egg2 in myList is: " + idX);
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is myList empty? " + isEmpty);
        boolean removedEgg = myList.remove(egg1);
        System.out.println("Was egg1 removed from myList? " + removedEgg);
    }
}
