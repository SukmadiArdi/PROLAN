package Tugas_2.Tugas;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private String nama;
    private int harga;

    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getInfo() {
        return nama + " - Rp" + harga;
    }
}

class Order {
    private Menu menu;
    private int jumlah;

    public Order(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return menu.getHarga() * jumlah;
    }

    public String getOrderInfo() {
        return "Pesanan: " + menu.getNama() + ", Jumlah: " + jumlah + ", Total: Rp" + getTotal();
    }
}

class Restaurant {
    private String nama;
    private List<Order> orders;

    public Restaurant(String nama) {
        this.nama = nama;
        this.orders = new ArrayList<>();
    }

    public void tambahOrder(Order order) {
        orders.add(order);
    }

    public void tampilkanNota() {
        System.out.println("--- Nota Restoran " + nama + " ---");
        int totalSeluruh = 0;
        for (Order order : orders) {
            System.out.println(order.getOrderInfo());
            totalSeluruh += order.getTotal();
        }
        System.out.println("Total Bayar: Rp" + totalSeluruh);
    }
}

class Main {
    public static void main(String[] args) {
        // Buat menu makanan
        Menu menu1 = new Menu("Nasi Goreng", 15000);
        Menu menu2 = new Menu("Mie Ayam", 12000);

        // Buat pesanan
        Order order1 = new Order(menu1, 2);  // 2 porsi Nasi Goreng
        Order order2 = new Order(menu2, 3);  // 3 porsi Mie Ayam

        // Buat restoran dan tambahkan pesanan
        Restaurant restoran = new Restaurant("Restoran Sederhana");
        restoran.tambahOrder(order1);
        restoran.tambahOrder(order2);

        // Tampilkan nota
        restoran.tampilkanNota();
    }
}
