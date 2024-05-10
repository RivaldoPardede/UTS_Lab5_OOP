package soal2b.uts.pbo5.util;//penamaan package

//import utilitas yang diperlukan
import java.util.Arrays;
public class anagramChecker { //membuat kelas baru bernaam anagramChecker

    //membuat method dengan nilai balika boolean untuk mengecek hasil anagram
    public boolean areAnagrams(String word1, String word2) {
        //mengubah semua huruf dalam kata/frasa menjadi huruf kecil untuk memudahkan pengecekan
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        //mengubah kata/frasa dari huruf kecil menjadi kumpulan array karakter
        char[] arrayChar1 = word1.toCharArray();
        char[] arrayChar2 = word2.toCharArray();

        //mengurutkan kata/frasa tersebut berdasarkan kode ASCII terkecil->terbesar
        Arrays.sort(arrayChar1);
        Arrays.sort(arrayChar2);

        //kemudian bandingkan 2 kata/frasa tersebut, jika memang identik, maka mereka adalah anagram
        return Arrays.equals(arrayChar1, arrayChar2);
    }
}
