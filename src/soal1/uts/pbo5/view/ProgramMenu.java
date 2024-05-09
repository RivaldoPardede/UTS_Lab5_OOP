package soal1.uts.pbo5.view; //penamaan package

//import package yang diperlukan
import java.util.ArrayList;
import java.util.Scanner;
import soal1.uts.pbo5.controller.*;
import soal1.uts.pbo5.model.*;

//Deklarasi class ProgramMenu untuk menampilkan menu-program dan mengelola interaksi dengan user
public class ProgramMenu {
    public static void displayMainMenu(ArrayList<Song>mySongs) {
        System.out.println("==== Welcome to OpenMusic Program =====");
        System.out.println("You currently have: " + mySongs.size() + " song(s).");
        //digunakan untuk menampilkan data yang dimiliki dalam arrayList, akan berubah seiring perubahan data

        System.out.println("Song's Menu");
        System.out.println("1. Add Song\n2. Get Songs\n3. Edit Song\n4. Delete Song\n");

        System.out.println("MediaPlayer's Menu");
        System.out.println("5. Play Song");

        System.out.println("\n6. Exit");
    } //digunakan untuk menampilkan menu awal

    public static void displayAddSongMenu(ArrayList<Song>mySongs, Scanner scanner) {
        //memiliki parameter ArrayList dan scanner untuk menampung data dan menerima inputan
        System.out.println("\n\n==== Add Song =====");

        scanner.nextLine();
        System.out.print("Enter song title: ");
        String title = scanner.nextLine();

        System.out.print("Enter song performer: ");
        String performer = scanner.nextLine();

        System.out.print("Enter song genre (optional, press Enter to skip): ");
        String genre = scanner.nextLine().trim();

        System.out.print("Enter song duration: ");
        int duration = scanner.nextInt();

        //digunakan untuk menentukan method addSong mana yang dipakai (addSong overload/normal) sesuai hasil inputan user.
        if (genre.isEmpty()) {
            Song.addSong(mySongs, title, performer, duration);
        } else {
            Song.addSong(mySongs, title, performer, genre, duration);
        }
    }//digunakan untuk menampilkan menu AddSong

    public static void displayGetSongsMenu(ArrayList<Song>mySongs) {
        System.out.println("\n\n==== Get Songs =====");

        System.out.println("Total Song(s): " + mySongs.size() + " song(s).");
        Song.getSongs(mySongs);
    } //digunakan untuk menampilkan menu getSongs

    public static void displayEditSongMenu(ArrayList<Song>mySongs, Scanner scanner) {
        System.out.println("\n\n==== Edit Song =====");

        displayGetSongsMenu(mySongs);

        System.out.print("Enter the song index you want to edit: ");
        int songNum = scanner.nextInt();

        int songIndex = songNum-1;

        //memastikan bahwa inputan berada pada range yang tepat
        while (songIndex < 0 || songIndex >= mySongs.size()) {
            System.out.println("Invalid chocie.");
            System.out.print("Enter the song index you want to edit: ");
            songNum = scanner.nextInt();
            songIndex = songNum-1;
        }

        Song songToEdit = mySongs.get(songIndex);

        //menampilkan data yang dimililki sebelum menerima inputan untuk data baru
        scanner.nextLine();
        System.out.println("Current title is \"" + songToEdit.getTitle() + "\"");
        System.out.print("Enter new title, press Enter to skip: ");
        String newTitle = scanner.nextLine();

        System.out.println("Current performer is " + songToEdit.getPerformer());
        System.out.print("Enter song performer, press Enter to skip: ");
        String newPerformer = scanner.nextLine();

        System.out.println("Current genre is " + songToEdit.getGenre());
        System.out.print("Enter song genre, press Enter to skip: ");
        String newGenre = scanner.nextLine().trim();

        System.out.println("Current duration is " + songToEdit.getDuration() + "s");
        System.out.print("Enter song duration: ");
        int newDuration = scanner.nextInt();

        Song.editSong(mySongs, songIndex, newTitle, newPerformer, newGenre, newDuration);
    } //digunakan untuk menampilkan menu editSongs

    public static void displayDeleteSongMenu(ArrayList<Song>mySongs, Scanner scanner) {
        System.out.println("\n\n==== Delete Song =====");

        displayGetSongsMenu(mySongs);

        System.out.print("Enter the song index you want to delete: ");
        int songNum = scanner.nextInt();

        int songIndex = songNum-1;

        while (songIndex < 0 || songIndex >= mySongs.size()) {
            System.out.println("Invalid chocie.");
            System.out.print("Enter the song index you want to delete: ");
            songNum = scanner.nextInt();
            songIndex = songNum-1;
        }

        Song.deleteSong(mySongs ,songIndex);
    } //digunakan untuk menampilkan menu deleteSong

    public static void displayPlaySongMenu(ArrayList<Song>mySongs, Scanner scanner) {
        System.out.println("\n\n==== Play Song =====");

        displayGetSongsMenu(mySongs);

        System.out.print("Enter the song index you want to play: ");
        int songNum = scanner.nextInt();

        int songIndex = songNum-1;

        while (songIndex < 0 || songIndex >= mySongs.size()) {
            System.out.println("Invalid chocie.");
            System.out.print("Enter the song index you want to play: ");
            songNum = scanner.nextInt();
            songIndex = songNum-1;
        }

        Song songToPlay = mySongs.get(songIndex);
        MediaPlayer mediaPlayer = new MediaPlayer(songToPlay.getTitle(), songToPlay.getPerformer(), songToPlay.getGenre(), songToPlay.getDuration());
        //Pembuatan instance dari media player, dikarenakan mediaplayer  memiliki method overriding yang ingin digunakan,
        //sehingga tidak memungkinkan penggunaan method static

        mediaPlayer.playSong(mySongs, songIndex);
        System.out.println("Press Enter to stop the song from playing: ");
        scanner.nextLine();
        scanner.nextLine();
        mediaPlayer.pauseSong(mySongs, songIndex);
    } //digunakan untuk menampilkan menu playSong
}