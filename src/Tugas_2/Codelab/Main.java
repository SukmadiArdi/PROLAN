package Tugas_2.Codelab;

public class Main {

    public static void main(String[] args) {

        Product prod = new Product("Smarttphone", 699.99, 50);
        Inventory inv = new Inventory(prod, "Warehouse A");

        inv.showInventory();

        prod.applyStockAdjustment(10);

    }
}
