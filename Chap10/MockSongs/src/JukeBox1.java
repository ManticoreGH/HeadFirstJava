import java.util.*;
public class JukeBox1 {

    public static void main(String[] args) {
        new JukeBox1().go();
        new JukeBox1().goV2();
    }

    private void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
    private void goV2() {
        List<SongV2> songList = MockSongs.getSongV2();
        System.out.println(songList);
        Collections.sort(songList); // This will not work as SongV2 does not implement Comparable
        // To sort SongV2 objects, we need to provide a Comparator
        System.out.println(songList);
    }
}
