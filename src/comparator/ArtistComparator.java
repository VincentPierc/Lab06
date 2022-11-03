package comparator;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ArtistComparator implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {
        return song1.getArtist().compareTo(song2.getArtist());
    }
}
