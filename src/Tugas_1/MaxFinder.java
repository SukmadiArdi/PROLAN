public class MaxFinder {

    // Fungsi untuk menemukan nilai maksimum dari tiga bilangan bulat
    public static int findMax(int a, int b, int c) {
        // Menggunakan Math.max untuk menemukan nilai maksimum
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi findMax
        int a = 10;
        int b = 25;
        int c = 20;

        int max = findMax(a, b, c);
        System.out.println("Nilai maksimum adalah: " + max);  // Output: Nilai maksimum adalah: 25
    }
}