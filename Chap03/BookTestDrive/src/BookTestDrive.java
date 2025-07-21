class Books {
    String title;
    String author;
}
public class BookTestDrive {
    public static void main(String[] args) throws Exception {
        Books[] myBooks = new Books[3];
        int x = 0;
        // Won't compile because Books is not initialized
        // myBooks[0] = new Books(); ...
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
