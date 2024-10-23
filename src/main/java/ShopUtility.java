import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ShopUtility {
    public static double getTotal(ArrayList<Item> items) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
    public static void printReceipt(Customer customer){
        String receiptFormat =
                "DATE %s\n" + "TIME %s\n" + "\n" + "AMT $ %.2f\n" + "TAX $ %.2f\n" + "\n" + "SALE $ %.2f\n";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String date = now.format(formatter);
        String time = now.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));

        double total = customer.getShoppingCart().calculateFinalTotal(customer);

        double tax =  customer.getShoppingCart().calculateStateTax(customer.getState());
        double sale = total + tax;

        System.out.printf(receiptFormat, date, time, total, tax, sale);

    }
}


