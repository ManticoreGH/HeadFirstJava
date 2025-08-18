package jukebox;

import java.util.Comparator;

public class BPMCompare implements Comparator<SongV3> {

	@Override
	public int compare(SongV3 one, SongV3 two) {
		return Integer.compare(one.getBpm(), two.getBpm());
	}
}
