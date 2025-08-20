package jukebox7;
import java.util.*;

public class Jukebox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox().go();
	}
	public void go() {
		List<SongV4> songList = MockMoreSongs.getSongsV4();
//		songList.add(new SongV4("50 ways", "simon", 102)); // can't add to unmodifiable list
	    System.out.println("Original List:");
		System.out.println(songList);
	    System.out.println("Sorted by title:");
	    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
	    System.out.println(songList);
	    System.out.println("Sorted by artist:");
	    songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
	    System.out.println(songList);
	    
	    Set<SongV4> songSet = new HashSet<>(songList);// HashSet does not maintain order, but removes duplicates
	    System.out.println("Set of Songs:");
	    System.out.println(songSet);
	    
	    Set<SongV4> songSet2 = new TreeSet<>(songList); // TreeSet requires Comparable to sort elements
	    System.out.println("TreeSet of Songs:");
	    System.out.println(songSet2);
	    // Sorting by bpm using a custom comparator
	    System.out.println("TreeSet of Songs sorted by BPM:");
	    Set<SongV4> songSet3 = new TreeSet<>((one, two)-> Integer.compare(one.getBpm(), two.getBpm()));
	    songSet3.addAll(songList);
	    System.out.println(songSet3);
	    
	    
	}
}
