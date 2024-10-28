package Tugas_2.Codelab;

public class Inventory {

    public Product product;
    public String location;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Inventory(Product product, String location) {

        setProduct(product);

        setLocation(location);

    }

    public void showInventory() {

        System.out.println("Location: " + location);

        product.displayProduct();

    }
}
