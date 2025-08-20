package jukebox7;

public class Song {
	private String title;
	private String artist;
	private int bpm;
	
	public Song(String title, String artist, int bpm) {
		this.setTitle(title);
		this.setArtist(artist);
		this.setBpm(bpm);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
}
