public class Item {
    private String name;
    private double price;
    private int quantity;
    private final int quantityInStock = 100;

    public Item() {
    }

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPrice(String name, double price) {
        return price;

    }

    public boolean isInStock(int quantity) {
        if (quantityInStock > quantity) {
            return true;
        } else {
            return false;
        }
    }
}