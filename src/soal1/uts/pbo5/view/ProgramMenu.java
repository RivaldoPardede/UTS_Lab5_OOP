package soal1.uts.pbo5.view;

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
        scanner.close();

        if (genre.isEmpty()) {
            Song.addSong(mySongs, title, performer, duration);
        } else {
            Song.addSong(mySongs, title, performer, genre, duration);
        }

        displayMainMenu(mySongs);
    }
}