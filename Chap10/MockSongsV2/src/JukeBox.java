import java.util.*;
public class JukeBox {

    public static void main(String[] args) {
        new JukeBox().goV2();
    }

    private void goV2() {
        List<SongV2> songList = MockSongs.getSongV2();
        System.out.println(songList);
        Collections.sort(songList); // This will not work as SongV2 does not implement Comparable
        // To sort SongV2 objects, we need to provide a Comparator
        System.out.println(songList);
    }
}
