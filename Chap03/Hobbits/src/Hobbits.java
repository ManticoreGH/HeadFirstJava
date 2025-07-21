public class Hobbits {
    String name;
    public static void main(String[] args) throws Exception {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while(z < 4){
            // The following line will cause an ArrayIndexOutOfBoundsException
            // and the first element will not be initialized.
            z++;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if(z == 1) {
                h[z].name = "Frodo";
            }
            if(z == 2) {
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name.");
        }
    }
}
