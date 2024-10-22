import java.util.ArrayList;

public class ShopUtility {
    public static double getTotal(ArrayList<Item> items) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
    public static void printReceipt(ArrayList<Item> items, double total, double tax){

    }
}


