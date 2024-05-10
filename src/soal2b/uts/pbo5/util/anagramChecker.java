package soal2b.uts.pbo5.util;

import java.util.Arrays;
public class anagramChecker {
    public boolean areAnagrams(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] arrayChar1 = word1.toCharArray();
        char[] arrayChar2 = word2.toCharArray();

        Arrays.sort(arrayChar1);
        Arrays.sort(arrayChar2);

        return Arrays.equals(arrayChar1, arrayChar2);
    }
}
