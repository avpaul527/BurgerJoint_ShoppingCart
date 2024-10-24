import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    private String name;
    private double price;
    private int quantity;
    private final int quantityInStock = 100;

    public Item() {}

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
        if (price >= 0){
            this.price = price;
        }else{
            System.out.println("Price cannot be negative");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0){
            this.quantity = quantity;
        }else{
            System.out.println("Amount entered incorrect please try again");
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public boolean isInStock(int quantity) {
        return quantityInStock >= quantity;
    }

    @Override
    public String toString() {//created tostring with string format to fix formatting issue when trying to print items
        return String.format("%s: $%.2f x %d", name, price, quantity);
    }
}