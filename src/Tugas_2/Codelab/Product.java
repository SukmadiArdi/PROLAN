package Tugas_2.Codelab;

public class Product {

    public static final double DISCOUNT_RATE = 0.1; // 10% discount as a constant

    public String name;
    public double price;
    public int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(String name, double price, int stock) {
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    public void displayProduct() {

        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());

        System.out.println("Discounted Price: $" + calculateDiscountedPrice());
        System.out.println("Stock: " + getStock());
    }

    private double calculateDiscountedPrice() {

        return getPrice() * (1 - DISCOUNT_RATE);

    }

    public void applyStockAdjustment(int adjustment) {

        stock += adjustment;

        System.out.println("Stock adjusted. New stock: " + stock);

    }

}
