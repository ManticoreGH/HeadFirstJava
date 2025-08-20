package jukebox;
import java.util.*;

public class JukeboxV6 {

	public static void main(String[] args) {
		new JukeboxV6().go();
	}

	private void go() {
		List<SongV3> songList = MockSongs.getSongV3();
		System.out.println(songList);
		songList.sort((one,two)-> one.getTitle().compareTo(two.getTitle()));
		System.out.println(songList);
		songList.sort((one,two)-> one.getArtist().compareTo(two.getArtist()));
		System.out.println(songList);
	}

}
