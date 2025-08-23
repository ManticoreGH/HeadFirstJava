import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class JukeboxStreams {
    public static void main(String[] args) throws Exception {
        Songs songs = new Songs();
        List<Song> songList = songs.getSongs();
        Stream<Song> songStream = songList.stream();
        // Predicate<Song> predicate = song -> song.getGenre().equals("Rock");
        /* 
            Modified line but return all genres containing "Rock"
            like "industrial rock" & "soft rock" 
            the other predicate only returns exact matches. 
        */
        Predicate<Song> predicate = song -> song.getGenre().contains("Rock");
        Predicate<Song> beatlesPredicate = song -> song.getArtist().equals("The Beatles");
        Predicate<Song> beginWithHPredicate = song -> song.getTitle().startsWith("H");
        Predicate<Song> yearAfter1995Predicate = song -> song.getYear() >= 1995;
        List<Song> rockSongs = songStream.filter(predicate)
        .sorted((s1, s2) -> Integer.compare(s2.getTimePlayed(), s1.getTimePlayed()))
        .collect(Collectors.toList());

        List<Song> beatlesSongs = songList.stream()
        .filter(beatlesPredicate)
        .sorted((s1, s2) -> Integer.compare(s2.getTimePlayed(), s1.getTimePlayed()))
        .collect(Collectors.toList());

        List<Song> beginWithHSongs = songList.stream()
        .filter(beginWithHPredicate)
        .sorted((s1, s2) -> Integer.compare(s2.getTimePlayed(), s1.getTimePlayed()))
        .collect(Collectors.toList());

        List<Song> yearAfter1995Songs = songList.stream()
        .filter(yearAfter1995Predicate)
        .sorted((s1, s2) -> Integer.compare(s2.getTimePlayed(), s1.getTimePlayed()))
        .collect(Collectors.toList());
        
        System.out.println("Rock Songs: \n" + rockSongs);
        System.out.println("=========================================================");
        System.out.println("Beatles Songs: \n" + beatlesSongs);
        System.out.println("=========================================================");
        System.out.println("Songs Beginning with 'H': \n" + beginWithHSongs);
        System.out.println("=========================================================");
        System.out.println("Songs Released After 1995: \n" + yearAfter1995Songs);
        System.out.println("=========================================================");

        List<String> genres = songList.stream()
        .map(song -> song.getGenre())
        .distinct()
        .collect(Collectors.toList());

        System.out.println("Genres: \n" + genres);
        System.out.println("=========================================================");

        String songTitle = "With a Little Help from My Friends";
        List<String> result = songList.stream() // Create a stream from the song list
        .filter(song -> song.getTitle().equals(songTitle)) // Find the song by title in this case "With a Little Help from My Friends"
        .map(song-> song.getArtist()) // Only artist are displayed
        .filter(artist -> !artist.equals("The Beatles")) // Exclude The Beatles
        .collect(Collectors.toList()); // Collect the results into a list
        System.out.println("Artists (excluding The Beatles): \n" + result);
        System.out.println("=========================================================");

    }
}
