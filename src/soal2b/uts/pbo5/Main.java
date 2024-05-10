package soal2b.uts.pbo5;//penamaan package

//import utilitas dan package yang diperlukan
import java.util.Scanner;
import soal2b.uts.pbo5.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Welcome to AnagramChecker Program =====\n");

        //membuat objek scanner untuk menerima inputan pengguna
        Scanner scanner = new Scanner(System.in);
        //membuat objek checker untuk mengecek status anagram
        anagramChecker checker = new anagramChecker();

        System.out.print("Input word 1: ");
        String word1 = scanner.nextLine();
        //menerima inputan untuk kata/frasa pertama

        System.out.print("Input word 2: ");
        String word2 = scanner.nextLine();
        //menerima inputan untuk kata/frasa kedua

        boolean anagramStatus = checker.areAnagrams(word1, word2);
        //variable anagramStatus untuk menampung hasil cek dari 2 kata/frasa

        System.out.println("Word 1 : " + word1);
        System.out.println("Word 2 : " + word2);

        System.out.println("\nAnagram Status: " + anagramStatus);
    }
}
//No. 2 Done