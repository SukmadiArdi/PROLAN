import java.util.Scanner;

public class HitungGaji {
    public long hitungGajiPokok(int jamKerja, int gajiPerJam) {
        if (jamKerja < 0 || gajiPerJam < 0) {
            throw new IllegalArgumentException("Jam kerja dan gaji per jam harus bernilai positif.");
        }
        return (long) jamKerja * gajiPerJam;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jam kerja: ");
            int jamKerja = scanner.nextInt();
            System.out.print("Masukkan gaji per jam: ");
            int gajiPerJam = scanner.nextInt();

            HitungGaji hitung = new HitungGaji();
            long gajiTotal = hitung.hitungGajiPokok(jamKerja, gajiPerJam);
            System.out.println("Gaji karyawan dengan " + jamKerja + " jam kerja = " + gajiTotal);
        } catch (Exception e) {
            System.out.println("Input tidak valid, harap masukkan angka yang benar.");
        }
    }
}

