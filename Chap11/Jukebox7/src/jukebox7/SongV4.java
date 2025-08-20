package jukebox7;

public class SongV4 implements Comparable<SongV4> {
	private String title;
	private String artist;
	private int bpm;
	
	public SongV4(String title, String artist, int bpm) {
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
	public int compareTo(SongV4 o) {
		return this.title.compareTo(o.title);
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	public boolean equals(Object aSong ) {
		SongV4 other = (SongV4) aSong;		
		return this.title.equals(other.title);
	}
	
	public int hashCode() {
		return title.hashCode(); // Use title for hash code
	}
}
