import java.util.*;
import java.util.function.*;
import java.util.stream.*;

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
        // Find the song by title in this case "With a Little Help from My Friends"
        List<String> result = songList.stream() // Create a stream from the song list
        .filter(song -> song.getTitle().equals(songTitle)) 
        .map(song-> song.getArtist()) // Only artist are displayed
        .filter(artist -> !artist.equals("The Beatles")) // Exclude The Beatles
        .collect(Collectors.toList()); // Collect the results into a list
        System.out.println("Artists (excluding The Beatles): \n" + result);
        System.out.println("=========================================================");

        // Sometimes you don't even need a lambda expression
        Function<Song, String> getGenre = Song::getGenre;
        List<Song> result2 = songList.stream()
        .sorted(Comparator.comparing(Song::getYear))
        .collect(Collectors.toList());
        System.out.println("Songs sorted by year: \n" + result2);
        System.out.println("=========================================================");
        // Using a Set despite the List (Set are better for uniqueness)
        Set<String> uniqueGenres = songList.stream()
        .map(Song::getGenre)
        .collect(Collectors.toSet());
        System.out.println("Unique Genres: \n" + uniqueGenres);
        System.out.println("=========================================================");
        // Generate an unmodifiable list
        List<String> unmodifiableList = songList.stream()
        .map(Song::getArtist)
        .distinct()
        .collect(Collectors.toUnmodifiableList());
        System.out.println("Unmodifiable List of Artists: \n" + unmodifiableList);
        // unmodifiableList.add("Led Zeppelin"); // This will throw an UnsupportedOperationException
        System.out.println("=========================================================");
        // unmodifiableSet
        Set<String> unmodifiableSet = songList.stream()
        .map(Song::getGenre)
        .collect(Collectors.toUnmodifiableSet());
        System.out.println("Unmodifiable Set of Genres: \n" + unmodifiableSet);
        System.out.println("=========================================================");
        
        // unmodifiableMap
        /* 
        Can't apply Map to the Song list because of duplicate keys
        Map<String, String> unmodifiableMap = songList.stream()
        .collect(Collectors.toUnmodifiableMap(Song::getArtist, Song::getTitle));
        System.out.println("Unmodifiable Map of Songs: \n" + unmodifiableMap);
        System.out.println("=========================================================");
        */
        // Collectors.joining create a String from the stream by concatening. Usefull 
        // for creating CSV or similar formats
        String allSongTitles = songList.stream()
        .map(Song::getTitle)
        .collect(Collectors.joining(", "));
        System.out.print("All Song Titles: \n" + allSongTitles);
        System.out.println("\n=========================================================");
        // Checking if something exists
        boolean hasR_B = songList.stream()
        .anyMatch(song -> song.getGenre().equals("R&B"));
        System.out.println("Contains R&B? " + hasR_B);
        System.out.println("=========================================================");
        // Find a specific thing
        Optional<Song> result3 = songList.stream()
        .filter(song -> song.getYear() == 1995)
        .findFirst();
        System.out.println("Find a specific song with the year 1995: \n" + result3);
        System.out.println("=========================================================");
        // Count items
        long result4 = songList.stream()
        .map(Song::getArtist)
        .distinct()
        .count();
        System.out.println("Count of unique Artists: " + result4);
        System.out.println("=========================================================");
    }
}
