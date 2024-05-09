package soal1.uts.pbo5.view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import soal1.uts.pbo5.controller.*;
import soal1.uts.pbo5.model.*;
public class ProgramMenu {
    public static void displayMainMenu(ArrayList<Song>mySongs) {
        System.out.println("==== Welcome to OpenMusic Program =====");
        System.out.println("You currently have: " + mySongs.size() + " song(s).");

        System.out.println("Song's Menu");
        System.out.println("1. Add Song\n2. Get Songs\n3. Edit Song\n4. Delete Song\n");

        System.out.println("MediaPlayer's Menu");
        System.out.println("5. Play Song\n6. Pause Song");

        System.out.println("\n7. Exit");
    }

    public static void displayAddSongMenu(ArrayList<Song>mySongs, Scanner scanner) {
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

        if (genre.isEmpty()) {
            Song.addSong(mySongs, title, performer, duration);
        } else {
            Song.addSong(mySongs, title, performer, genre, duration);
        }
    }

    public static void displayGetSongsMenu(ArrayList<Song>mySongs) {
        System.out.println("\n\n==== Get Songs =====");

        System.out.println("Total Song(s): " + mySongs.size() + " song(s).");
        Song.getSongs(mySongs);
    }

    public static void displayEditSongMenu(ArrayList<Song>mySongs, Scanner scanner) {
        System.out.println("\n\n==== Edit Song =====");

        displayGetSongsMenu(mySongs);

        System.out.print("Enter the song index you want to edit: ");
        int songNum = scanner.nextInt();

        int songIndex = songNum-1;

        while (songIndex <= 0 && songIndex > mySongs.size()) {
            System.out.println("Invalid chocie.");
            System.out.print("Enter the song index you want to edit: ");
            songIndex = scanner.nextInt();
        }

        Song songToEdit = mySongs.get(songIndex);

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
        System.out.print("Enter song duration, press Enter to skip: ");
        int newDuration = scanner.nextInt();

        Song.editSong(mySongs, songIndex, newTitle, newPerformer, newGenre, newDuration);

    }
}