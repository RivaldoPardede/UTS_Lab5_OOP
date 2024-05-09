package soal1.uts.pbo5.model;

import java.util.ArrayList;

public class Song {
    String title, performer, genre;

    int duration;

    public Song (String title, String performer, String genre, int duration) {
        this.title = title;
        this.performer = performer;
        this.genre = genre;
        this.duration = duration;
    }

    public static void addSong(ArrayList<Song>mySongs,String title, String performer, String genre, int duration) {
        Song newSong = new Song(title, performer, genre, duration);
        mySongs.add(newSong);
        System.out.println("The song \"" + title + "\" has been successfully added.\n");
    }

    public static void addSong(ArrayList<Song>mySongs, String title, String performer, int duration) {
        Song newSong = new Song(title, performer, "none", duration);
        mySongs.add(newSong);
        System.out.println("The song \"" + title + "\" with " + newSong.genre + " genre has been successfully added.\n");
    }
}
