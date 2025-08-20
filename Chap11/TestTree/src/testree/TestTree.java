package testree;
import java.util.*;

public class TestTree {

	public static void main(String[] args) {
		new TestTree().run();
	}

	private void run() {
		Book b1 = new Book("How cats work");
		Book b2 = new Book("Remix your body");
		Book b3 = new Book("Finding Emo");
		
		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
		
		Set<Book> tree2 = new TreeSet<>(new BookCompare());
		tree2.add(b1);
		tree2.add(b2);
		tree2.add(b3);
		System.out.println(tree2);
	}
}
