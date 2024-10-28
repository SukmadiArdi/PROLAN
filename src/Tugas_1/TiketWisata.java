import java.util.Scanner;

public class TiketWisata {

    // Custom Exception untuk validasi input kosong
    static class DataKosongException extends Exception {
        public DataKosongException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input nama
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            if (nama.isEmpty()) {
                throw new DataKosongException("Nama harus diisi");
            }

            // Input hari
            System.out.print("Masukkan hari (Senin - Minggu): ");
            String hari = scanner.nextLine();
            if (hari.isEmpty()) {
                throw new DataKosongException("Hari harus diisi");
            }

            // Input tanggal
            System.out.print("Masukkan tanggal (DD/MM/YYYY): ");
            String tanggal = scanner.nextLine();
            if (tanggal.isEmpty()) {
                throw new DataKosongException("Tanggal harus diisi");
            }

            // Input jenis tiket
            System.out.print("Jenis tiket (Reguler/Terusan): ");
            String jenisTiket = scanner.nextLine();

            // Input kategori umur
            System.out.print("Kategori umur (Dewasa/Anak-anak): ");
            String kategoriUmur = scanner.nextLine();

            // Input jumlah tiket
            System.out.print("Masukkan jumlah tiket: ");
            int jumlahTiket = scanner.nextInt();
            if (jumlahTiket <= 0) {
                throw new IllegalArgumentException("Jumlah tiket tidak valid");
            }

            // Menghitung harga tiket
            int hargaTiket = hitungHargaTiket(jenisTiket, kategoriUmur, hari);
            int totalHarga = hargaTiket * jumlahTiket;

            // Output rincian tiket
            System.out.println("\n--- Rincian Pembelian Tiket ---");
            System.out.println("Nama: " + nama);
            System.out.println("Tanggal: " + tanggal);
            System.out.println("Jenis Tiket: " + jenisTiket);
            System.out.println("Kategori Umur: " + kategoriUmur);
            System.out.println("Harga per Tiket: " + hargaTiket);
            System.out.println("Jumlah Tiket: " + jumlahTiket);
            System.out.println("Total Harga: " + totalHarga);

        } catch (DataKosongException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk menghitung harga tiket
    public static int hitungHargaTiket(String jenisTiket, String kategoriUmur, String hari) {
        int harga = 0;

        if (jenisTiket.equalsIgnoreCase("Reguler")) {
            if (kategoriUmur.equalsIgnoreCase("Dewasa")) {
                harga = 75000;
            } else if (kategoriUmur.equalsIgnoreCase("Anak-anak")) {
                harga = 60000;
            }
        } else if (jenisTiket.equalsIgnoreCase("Terusan")) {
            if (kategoriUmur.equalsIgnoreCase("Dewasa")) {
                harga = 100000;
            } else if (kategoriUmur.equalsIgnoreCase("Anak-anak")) {
                harga = 85000;
            }
        }

        // Jika hari Sabtu atau Minggu, tambahkan 20%
        if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
            harga += harga * 0.2;
        }

        return harga;
    }
}
