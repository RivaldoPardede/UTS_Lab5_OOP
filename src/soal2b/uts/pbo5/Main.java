package soal2b.uts.pbo5;

import java.util.Scanner;
import soal2b.uts.pbo5.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Welcome to AnagramChecker Program =====\n");

        Scanner scanner = new Scanner(System.in);
        anagramChecker checker = new anagramChecker();

        System.out.print("Input word 1: ");
        String word1 = scanner.nextLine();

        System.out.print("Input word 2: ");
        String word2 = scanner.nextLine();

        boolean anagramStatus = checker.areAnagrams(word1, word2);

        System.out.println("Word 1 : " + word1);
        System.out.println("Word 2 : " + word2);

        System.out.println("\nAnagram Status: " + anagramStatus);
    }
}
