import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class MockSongs {
    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("cassidy");
        songs.add("50 ways");
        return songs;
    }
    public static List<SongV2> getSongV2(){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 147));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 110));
        songs.add(new SongV2("havana", "camila cabello", 130));
        songs.add(new SongV2("cassidy", "grateful dead", 120));
        songs.add(new SongV2("50 ways", "paul simon", 140));
        return songs;
    }
}