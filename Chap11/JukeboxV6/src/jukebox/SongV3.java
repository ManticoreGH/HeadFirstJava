package jukebox;

public class SongV3 implements Comparable<SongV3> {
	private String title;
	private String artist;
	private int bpm;

	@Override
	public int compareTo(SongV3 o) {
		return this.title.compareTo(o.getTitle());
	}
	
	SongV3(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public int getBpm() {
		return this.bpm;
	}
	
	@Override
	public String toString() {
		return title;
	}
}
