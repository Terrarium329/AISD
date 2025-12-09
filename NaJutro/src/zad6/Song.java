package zad6;

import zad5.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "" + artist + "-" + duration;
    }

    public static void main(String[] args) {
        ArrayList<Song> piosenki = new ArrayList<>();
        piosenki.add(new Song("One way or another","Blondie",3));
        piosenki.add(new Song("Sonne","Rammstein",4));
        piosenki.add(new Song("Sonne","Zammstein",1));
        piosenki.add(new Song("Sonne","Aammstein",2));
        piosenki.add(new Song("Sonne","o",3));

        System.out.println(piosenki);
        piosenki.sort(new DurationComparator());
        System.out.println(piosenki);
        piosenki.sort(new ArtistTitleComparator());
        System.out.println(piosenki);
    }
}

class DurationComparator implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2) {
        return (Integer.compare(o1.duration, o2.duration));
    }
}

class ArtistTitleComparator implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2) {
        if (Character.compare(o1.artist.charAt(0),o2.artist.charAt(0)) != 0){
            return Character.compare(o1.artist.charAt(0),o2.artist.charAt(0));
        }else{
            return Character.compare(o1.title.charAt(0),o2.title.charAt(0));
        }
    }
}

