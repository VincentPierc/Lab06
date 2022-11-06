package comparator;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ArtistComparator implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {
        String artist1 = song1.getArtist();
        String artist2 = song2.getArtist();
        return artist1.compareTo(artist2);
    }
}
