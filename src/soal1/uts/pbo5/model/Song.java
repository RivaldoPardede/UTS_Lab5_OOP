package soal1.uts.pbo5.model;

import java.util.ArrayList;

public class Song {
    private String title, performer, genre;

    private int duration;

    public Song (String title, String performer, String genre, int duration) {
        this.title = title;
        this.performer = performer;
        this.genre = genre;
        this.duration = duration;
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setPerformer(String performer) { this.performer = performer; }
    public String getPerformer() { return performer; }

    public void setGenre(String genre) { this.genre = genre; }
    public String getGenre() { return genre; }

    public void setDuration(int duration) { this.duration = duration; }
    public int getDuration() { return duration; }

    public static void addSong(ArrayList<Song>mySongs, String title, String performer, String genre, int duration) {
        Song newSong = new Song(title, performer, genre, duration);
        mySongs.add(newSong);
        System.out.println("The song \"" + title + "\" has been successfully added.\n");
    }

    public static void addSong(ArrayList<Song>mySongs, String title, String performer, int duration) {
        Song newSong = new Song(title, performer, "none", duration);
        mySongs.add(newSong);
        System.out.println("The song \"" + title + "\" with " + newSong.genre + " genre has been successfully added.\n");
    }

    public static void getSongs(ArrayList<Song>mySongs) {
        int i = 0;
        for (Song song : mySongs) {
            ++i;
            System.out.println(i + ". Song title: " + song.title);
            System.out.println("Song performer: " + song.performer);
            System.out.println("Song genre: " + song.genre);
            System.out.println("Song duration: " + song.duration + " detik\n");
        }
        System.out.println();
    }

    public static void editSong(ArrayList<Song>mySongs, int songIndex, String newTitle, String newPerformer, String newGenre, int newDuration) {
        Song songToEdit = mySongs.get(songIndex);

        songToEdit.setTitle(newTitle);
        songToEdit.setPerformer(newPerformer);
        songToEdit.setGenre(newGenre);
        songToEdit.setDuration(newDuration);

        System.out.println("The song has been successfully edited.\n");
    }
}
