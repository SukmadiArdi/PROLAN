package Tugas_2.Tugas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Kelas PenghitungOngkosKirimRefactoring bertanggung jawab untuk menghitung ongkos kirim
 * berdasarkan berat barang dan tujuan pengiriman.
 *
 * Biaya per kilogram untuk tujuan tertentu disimpan dalam sebuah Map.
 * Jika tujuan tidak ditemukan, akan menggunakan biaya standar.
 *
 * @author [Achmad Ardi Sukmadi]
 * @version 1.0
 */
class PenghitungOngkosKirimRefactoring1 {

    // Konstanta Biaya Per Kota
    private static final double BIAYA_STANDAR = 15000;
    private static final Map<String, Double> biayaPerKgMap = new HashMap<>();

    // Inisialisasi biaya per kilogram berdasarkan kota tujuan
    static {
        biayaPerKgMap.put("jakarta", 10000.0);
        biayaPerKgMap.put("surabaya", 12000.0);
        biayaPerKgMap.put("bandung", 9000.0);
        biayaPerKgMap.put("yogyakarta", 11000.0);
    }

    /**
     * Menghitung ongkos kirim berdasarkan berat barang dan tujuan pengiriman.
     *
     * @param beratBarang berat barang yang akan dikirim (dalam kilogram)
     * @param tujuan kota tujuan pengiriman
     * @return total biaya ongkos kirim berdasarkan berat barang dan tujuan
     */
    public static double hitungOngkosKirim(double beratBarang, String tujuan) {
        // Menggunakan Map untuk mencari biaya per kg
        double biayaPerKg = biayaPerKgMap.getOrDefault(tujuan.toLowerCase(), BIAYA_STANDAR);
        return beratBarang * biayaPerKg;
    }

    /**
     * Meminta input dari pengguna untuk berat barang yang akan dikirim.
     *
     * @param input Scanner yang digunakan untuk mengambil input dari pengguna
     * @return berat barang dalam kilogram
     */
    public static double getInputBerat(Scanner input) {
        System.out.print("Masukkan berat barang (kg): ");
        return input.nextDouble();
    }

    /**
     * Meminta input dari pengguna untuk tujuan pengiriman.
     *
     * @param input Scanner yang digunakan untuk mengambil input dari pengguna
     * @return tujuan pengiriman dalam bentuk string
     */
    public static String getInputTujuan(Scanner input) {
        System.out.print("Masukkan tujuan pengiriman: ");
        return input.next();
    }

    /**
     * Metode utama untuk menjalankan program.
     * Mengambil input berat barang dan tujuan dari pengguna, kemudian menghitung dan menampilkan ongkos kirim.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input
        double berat = getInputBerat(input);
        String tujuan = getInputTujuan(input);

        // Menghitung ongkos kirim
        double totalBiaya = hitungOngkosKirim(berat, tujuan);

        // Menampilkan hasil perhitungan ongkos kirim
        System.out.println("Total ongkos kirim ke " + tujuan + " adalah: Rp " + totalBiaya);

        input.close();
    }
}
