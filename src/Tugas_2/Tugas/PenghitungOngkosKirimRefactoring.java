package Tugas_2.Tugas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PenghitungOngkosKirimRefactoring {

    // Konstanta Biaya Per Kota
    private static final double BIAYA_STANDAR = 15000;
    private static final Map<String, Double> biayaPerKgMap = new HashMap<>();

    static {
        biayaPerKgMap.put("jakarta", 10000.0);
        biayaPerKgMap.put("surabaya", 12000.0);
        biayaPerKgMap.put("bandung", 9000.0);
        biayaPerKgMap.put("yogyakarta", 11000.0);
    }

    public static double hitungOngkosKirim(double beratBarang, String tujuan) {
        // Menggunakan Map untuk mencari biaya per kg
        double biayaPerKg = biayaPerKgMap.getOrDefault(tujuan.toLowerCase(), BIAYA_STANDAR);
        return beratBarang * biayaPerKg;
    }

    // Metode untuk input berat barang
    public static double getInputBerat(Scanner input) {
        System.out.print("Masukkan berat barang (kg): ");
        return input.nextDouble();
    }

    // Metode untuk input tujuan pengiriman
    public static String getInputTujuan(Scanner input) {
        System.out.print("Masukkan tujuan pengiriman: ");
        return input.next();
    }

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
