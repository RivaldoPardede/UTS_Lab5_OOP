package soal1.uts.pbo5.model; //penamaan package

//import package yang diperlukan
import java.util.ArrayList;

// Deklarasi class Song, untuk merepresentasikan sebuah lagu
// Objek Song berguna untuk merepresentasikan lagu-lagu individual
public class Song {
//Mengatur access modifier pada variable class Song,
//Untuk menghindari perubahan data di luar scope
    private String title, performer, genre;
    private int duration;

//constructor Song berguna untuk membuat object Song dengan memberikan nilai awal pada atribut
    public Song (String title, String performer, String genre, int duration) {
        this.title = title;
        this.performer = performer;
        this.genre = genre;
        this.duration = duration;
    }

//Menggunakan method setter dan getter untuk memberi dan mendapatkan nilai dari objek Song
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setPerformer(String performer) { this.performer = performer; }
    public String getPerformer() { return performer; }

    public void setGenre(String genre) { this.genre = genre; }
    public String getGenre() { return genre; }

    public void setDuration(int duration) { this.duration = duration; }
    public int getDuration() { return duration; }

//method addSong untuk menambahkan lagu
    public static void addSong(ArrayList<Song>mySongs, String title, String performer, String genre, int duration) {
        Song newSong = new Song(title, performer, genre, duration); //instansiasi lagu baru
        mySongs.add(newSong);//kemudian ditambahkan ke arraylist
        System.out.println("The song \"" + title + "\" has been successfully added.\n");//memberi pesan berhasil
    }

//Method Overloading addSong, menjadi alternatif lain jika user tidak ingin memberi inputan untuk genre
    public static void addSong(ArrayList<Song>mySongs, String title, String performer, int duration) {
        Song newSong = new Song(title, performer, "none", duration);
        mySongs.add(newSong);
        System.out.println("The song \"" + title + "\" with " + newSong.genre + " genre has been successfully added.\n");
    }

//Method getSongs untuk mendapatkan semua data lagu yang ada
    public static void getSongs(ArrayList<Song>mySongs) {
        int i = 0;
        for (Song song : mySongs) { //perulangan untuk menampilkan semua lagu yagn dimilki
            ++i;
            System.out.println(i + ". Song title: " + song.title);
            System.out.println("Song performer: " + song.performer);
            System.out.println("Song genre: " + song.genre);
            System.out.println("Song duration: " + song.duration + " detik\n");
        }
        System.out.println();
    }

//Method editSong untuk mengubah data dari lagu menggunakan method setter
    public static void editSong(ArrayList<Song>mySongs, int songIndex, String newTitle, String newPerformer, String newGenre, int newDuration) {
        Song songToEdit = mySongs.get(songIndex);

        songToEdit.setTitle(newTitle);
        songToEdit.setPerformer(newPerformer);
        songToEdit.setGenre(newGenre);
        songToEdit.setDuration(newDuration);

        System.out.println("The song has been successfully edited.\n");
    }

//Method deleteSong untuk menghapus lagu
    public static void deleteSong(ArrayList<Song>mySongs, int songIndex) {
        mySongs.remove(songIndex);
        System.out.println("The song has been successfully deleted.\n");
    }

//Method Overriding, playSong dan pauseSong yang akan di overriding di subClass mediaPlayer
    public void playSong(ArrayList<Song>mySongs, int songIndex) {
        Song songToPlay = mySongs.get(songIndex);
        System.out.println("Now playing: " + songToPlay.title);
    }

    public void pauseSong(ArrayList<Song>mySongs, int songIndex) {
        Song songToPause = mySongs.get(songIndex);
        System.out.println("Now stopping: " + songToPause.title);
    }
}
