package Tugas_2.Tugas;

import java.util.Scanner;

public class PenghitungOngkosKirim {

    // Metode untuk menghitung ongkos kirim
    public static double hitungOngkosKirim(double beratBarang, String tujuan) {
        double biayaPerKg = 0;

        // Penentuan biaya berdasarkan tujuan pengiriman
        switch (tujuan.toLowerCase()) {
            case "jakarta":
                biayaPerKg = 10000; // contoh biaya per kg ke Jakarta
                break;
            case "surabaya":
                biayaPerKg = 12000; // contoh biaya per kg ke Surabaya
                break;
            case "bandung":
                biayaPerKg = 9000; // contoh biaya per kg ke Bandung
                break;
            case "yogyakarta":
                biayaPerKg = 11000; // contoh biaya per kg ke Yogyakarta
                break;
            default:
                System.out.println("Tujuan tidak tersedia. Menggunakan biaya standar.");
                biayaPerKg = 15000; // biaya standar jika tujuan tidak ada dalam daftar
                break;
        }

        // Menghitung total biaya pengiriman
        return beratBarang * biayaPerKg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat barang dari pengguna
        System.out.print("Masukkan berat barang (kg): ");
        double berat = input.nextDouble();

        // Input tujuan pengiriman dari pengguna
        System.out.print("Masukkan tujuan pengiriman: ");
        String tujuan = input.next();

        // Menghitung ongkos kirim
        double totalBiaya = hitungOngkosKirim(berat, tujuan);

        // Menampilkan hasil perhitungan ongkos kirim
        System.out.println("Total ongkos kirim ke " + tujuan + " adalah: Rp " + totalBiaya);

        input.close();
    }
}
