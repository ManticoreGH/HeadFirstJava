package jukebox;

import java.util.*;

public class JukeBox4 {

	public static void main(String[] args) {
		new JukeBox4().go();
	}

	private void go() {
		List<SongV3> songList = MockSongs.getSongV3();
		System.out.println(songList);
		//Collections.sort(songList);
		// Sort by title
		TitleCompare titleCompare = new TitleCompare();
		songList.sort(titleCompare);
		System.out.println(songList);
		// Sort by artist
		ArtistCompare artistCompare = new ArtistCompare();
		songList.sort(artistCompare);
		System.out.println(songList);
		// Sort by BPM
		BPMCompare bpmCompare = new BPMCompare();
		songList.sort(bpmCompare);
		System.out.println(songList);
		System.out.println("-------------------");
		// Sort by title using anonymous class
		songList.sort(new Comparator<SongV3>() {
			@Override
			public int compare(SongV3 one, SongV3 two) {
				return one.getTitle().compareTo(two.getTitle());
			}
		});
		System.out.println(songList);
		songList.sort(new Comparator<SongV3>() {
			@Override
			public int compare(SongV3 one, SongV3 two) {
				return one.getArtist().compareTo(two.getArtist());
			}
		});
		System.out.println(songList);
		songList.sort(new Comparator<SongV3>() {
			@Override
			public int compare(SongV3 one, SongV3 two) {
				return Integer.compare(one.getBpm(), two.getBpm());
			}
		});
		System.out.println(songList);
		System.out.println("-------------------");
		// Sort by title using lambda expression
		songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
		System.out.println(songList);
		// Sort by artist using lambda expression
		songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
		System.out.println(songList);
		// Sort by BPM using lambda expression
		songList.sort((one, two) -> Integer.compare(one.getBpm(), two.getBpm()));
		System.out.println(songList);
	}
}


