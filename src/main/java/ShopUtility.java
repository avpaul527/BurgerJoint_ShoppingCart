import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShopUtility {
    public static void printReceipt(Customer customer) {
        String receiptFormat =
                "DATE: %s\n" + "TIME: %s\n" + "\n" + "AMT: $%.2f\n" + "TAX: $%.2f\n" + "\n" + "SALE: $%.2f\n";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String date = now.format(dateFormatter);
        String time = now.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));

        double total = customer.getShoppingCart().calculateFinalTotal(customer);
        double tax = customer.getShoppingCart().calculateStateTax(customer.getState());

        System.out.printf(receiptFormat, date, time, total - tax, tax, total);
    }
}