package jukebox7;

public class SongV3 {
	private String title;
	private String artist;
	private int bpm;
	
	public SongV3(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}
	
	public String getArtist() {
		return artist;
	}

	public String getTitle() {
		return title;
	}
	
	public int getBpm() {
		return bpm;
	}
	
	@Override
	public String toString() {
		return title;
	}	
}
