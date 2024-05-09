package soal1.uts.pbo5.controller; //penamaan package

//import package yang diperlukan
import soal1.uts.pbo5.model.Song;
import java.util.ArrayList;

//Deklarasi class MediaPlayer yang merupakan subclass dari class Song untuk mengontrol pemutaran lagu
public class MediaPlayer extends Song {
//Constructor MediaPlayer untuk membuat objek MediaPlayer engan memberikan nilai awal pada atributnya
    public MediaPlayer(String title, String performer, String genre, int duration) {
        super(title, performer, genre, duration);
    }

//Melakukan overriding pada method playSong dari superclass Song untuk menampilkan judul lagu yang sedang diputar
    @Override
    public void playSong(ArrayList<Song> mySongs, int songIndex) {
        Song songToPlay = mySongs.get(songIndex);
        System.out.println("Now playing: " + songToPlay.getTitle());
    }

//Melakukan overriding pada method pauseSong dari superclass Song untuk menampilkan judul lagu yang sedang dihentikan
    @Override
    public void pauseSong(ArrayList<Song> mySongs, int songIndex) {
        Song songToPause = mySongs.get(songIndex);
        System.out.println("Now stopping: " + songToPause.getTitle());
        System.out.println();
    }
}
