package soal1.uts.pbo5.controller;

import soal1.uts.pbo5.model.Song;

import java.util.ArrayList;

public class MediaPlayer extends Song {
    public MediaPlayer(String title, String performer, String genre, int duration) {
        super(title, performer, genre, duration);
    }

    @Override
    public void playSong(ArrayList<Song> mySongs, int songIndex) {
        Song songToPlay = mySongs.get(songIndex);
        System.out.println("Now playing: " + songToPlay.getTitle());
    }

    @Override
    public void pauseSong(ArrayList<Song> mySongs, int songIndex) {
        Song songToPause = mySongs.get(songIndex);
        System.out.println("Now stopping: " + songToPause.getTitle());
        System.out.println();
    }
}
