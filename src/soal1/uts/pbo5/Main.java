package soal1.uts.pbo5; //penamaan package

//import package yang diperlukan
import java.util.ArrayList;
import java.util.Scanner;
import soal1.uts.pbo5.model.*;
import soal1.uts.pbo5.view.*;

//Deklarasi kelas Main sebagai kelas utama program
public class Main {
    public static void main(String[] args) {
        //Membuat objek ArrayList untuk menyimpan data lagu
        ArrayList<Song>mySongs = new ArrayList<>();
        //Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        //Memanggil method displayMainMenu untuk menampilkan menu utama
        //dan mendapatkan jumlah lagu yang dimiliki pengguna
        ProgramMenu.displayMainMenu(mySongs);

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

//Pengulangan untuk menampilkan menu utama dan menerima input pengguna sampai pengguna memilih keluar (pilihan 6)
        while (choice != 6) {
            switch (choice) {
                case 1 :
//Memanggil method displayAddSongMenu dari kelas ProgramMenu untuk menampilkan menu "Add Song" dan mengelola proses penambahan lagu
                    ProgramMenu.displayAddSongMenu(mySongs ,scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 2 :
//Memanggil method displayGetSongsMenu dari kelas ProgramMenu untuk menampilkan menu "Get Songs" dan mengelola proses mendapatkan daftar lagu
                    ProgramMenu.displayGetSongsMenu(mySongs);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 3 :
//Memanggil method displayEditSongMenu dari kelas ProgramMenu untuk menampilkan menu "Edit Song" dan mengelola proses pengeditan lagu
                    ProgramMenu.displayEditSongMenu(mySongs, scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 4 :
//Memanggil method displayDeleteSongMenu dari kelas ProgramMenu untuk menampilkan menu "Delete Song" dan mengelola proses penghapusan lagu
                    ProgramMenu.displayDeleteSongMenu(mySongs, scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                case 5 :
//Memanggil method displayPlaySongMenu dari kelas ProgramMenu untuk menampilkan menu "Play Song" dan mengelola proses pemutaran lagu
                    ProgramMenu.displayPlaySongMenu(mySongs, scanner);
                    ProgramMenu.displayMainMenu(mySongs);
                    break;
                default:
                    //Jika pengguna memilih pilihan yang tidak valid
                    System.out.println("Invalid chocie.");
                    break;
            }
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
        }

        scanner.close();// Menutup objek Scanner setelah selesai digunakan
    }
}
//No. 1 done