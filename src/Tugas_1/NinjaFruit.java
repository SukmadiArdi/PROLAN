import java.util.*;

public class NinjaFruit {
    public static void main(String[] args) {
        //list{String}
        List<String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka");
        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }

    public static int calculateTotalLength(List<String> words) { // Menghitung jumlah huruf
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return totalLength;
    }

    public static String findLongestWord(List<String> words) { // Menemukan kata terpanjang
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong");
        }
        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static List<String> capitalizeWords(List<String> words) { // Mengubah setiap huruf menjadi kapital
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            capitalized.add(word.toUpperCase());
        }
        return capitalized;
    }

    public static List<Integer> wordLengths(List<String> words) { // Menghitung panjang kata
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }
        return lengths;
    }
}
