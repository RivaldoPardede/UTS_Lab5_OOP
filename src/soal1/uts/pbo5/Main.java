package soal1.uts.pbo5;

import java.util.ArrayList;
import java.util.Scanner;
import soal1.uts.pbo5.controller.*;
import soal1.uts.pbo5.model.*;
import soal1.uts.pbo5.view.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song>mySongs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ProgramMenu.displayMainMenu(mySongs);

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        while (choice != 7) {
            switch (choice) {
                case 1 :
                    ProgramMenu.displayAddSongMenu(mySongs ,scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 2 :
                    ProgramMenu.displayGetSongsMenu(mySongs);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 3 :
                    ProgramMenu.displayEditSongMenu(mySongs, scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 4 :
                    ProgramMenu.displayDeleteSongMenu(mySongs, scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                default:
                    System.out.println("Invalid chocie.");
                    break;
            }
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
        }

        scanner.close();
    }
}