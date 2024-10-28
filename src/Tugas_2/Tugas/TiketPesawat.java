package Tugas_2.Tugas;

public class TiketPesawat {
    protected  String nama;
    protected  String asal;
    protected  String dst;
    protected  double Tiket;
    protected  double disk;

    public TiketPesawat(String nama, String asal, String dst, double Tiket, double disk) {
        this.nama = nama;
        this.asal = asal;
        this.dst = dst;
        this.Tiket = Tiket;
        this.disk = disk;
    }

    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (disk / 100));
    }

    public double hitungDiskon() {
        return Tiket *  (disk / 100);
    }

    public void tampilkanInformasi() {
        System.err.println("Nama Penumpang: " + nama);
        System.err.println("Asal: " + asal);
        System.err.println("Tujuan: " + dst);
        System.err.println("Harga Tiket: " + Tiket);
        System.err.println("Diskon: " + disk + "%");
        System.err.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.err.println("Jumlah Diskon: " + hitungDiskon());
    }
}