package sortmountains;
import java.util.*;

public class SortMountains {

	public static void main(String[] args) {
		new SortMountains().go();
	}

	private void go() {
		List<Mountain> mountains = new ArrayList<>();
		mountains.add(new Mountain("Longs", 14255));
		mountains.add(new Mountain("Elbert", 14433));
		mountains.add(new Mountain("Maroon", 14156));
		mountains.add(new Mountain("Castle", 14265));
		
		System.out.println("Mountains before sorting:");
		System.out.println(mountains);
		mountains.sort((m1, m2)->
			m1.getName().compareTo(m2.getName())
		);
		System.out.println("Mountains after sorting by name:");
		System.out.println(mountains);
		mountains.sort((m1, m2)->
			Integer.compare(m1.getHeight(), m2.getHeight())
		);
		System.out.println("Mountains after sorting by height:");
		System.out.println(mountains);
	}
}
