import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
    public static void priceCheck(Item burger, Item fries, Item soda) {
        Scanner scanner = new Scanner(System.in);

        boolean j = true;
        while (j) {

            System.out.println("What would you like to know the price of?");
            System.out.println("To quit type anything besides burger fries or soda");
            String x = scanner.nextLine();

            if (x.equalsIgnoreCase(burger.getName())) {
                System.out.printf("$%.2f\n", burger.getPrice());
            } else if (x.equalsIgnoreCase(fries.getName())) {
                System.out.printf("$%.2f\n", fries.getPrice());
            } else if (x.equalsIgnoreCase(soda.getName())) {
                System.out.printf("$%.2f\n", soda.getPrice());
            } else {
                System.out.println("");
                j = false;
            }


        }

    }

    public static void removeCart(Item burger, Item fries, Item soda){
        Scanner scanner = new Scanner(System.in);

        boolean j = true;
        while (j) {

            System.out.println("Burger Qty = " + burger.getQuantity() + "\nFries Qty = " + fries.getQuantity() + "\nSoda Qty = " + soda.getQuantity());
            System.out.println("Would you like to make adjustments -> Yes or No");
            String x = scanner.nextLine();

            String lowerCase = x.toLowerCase();
            String yes = "yes";
            if (lowerCase.contains(yes)) {
                System.out.println("Which qty would you like to change: Burger, Fries, or soda");
                String answer = scanner.nextLine();
                String answerToLower = answer.toLowerCase();
                if (answerToLower.contains("burger")){
                    System.out.println("Current burger qty = " + burger.getQuantity() + "\nHow many would you like instead?");
                    int burgerQty = scanner.nextInt();
                    scanner.nextLine();
                    burger.setQuantity(burgerQty);
                    System.out.println("New Burger qty = " + burger.getQuantity() + "\n");
                }
                if (answerToLower.contains("fries")){
                    System.out.println("Current fries qty = " + fries.getQuantity() + "\nHow many would you like instead?");
                    int friesQty = scanner.nextInt();
                    scanner.nextLine();
                    fries.setQuantity(friesQty);
                    System.out.println("New fries qty = " + fries.getQuantity() + "\n");
                }
                if (answerToLower.contains("soda")){
                    System.out.println("Current soda qty = " + soda.getQuantity() + "\nHow many would you like instead?");
                    int sodaQty = scanner.nextInt();
                    scanner.nextLine();
                    soda.setQuantity(sodaQty);
                    System.out.println("New soda qty = " + soda.getQuantity() + "\n");
                }

            } else {
                scanner.close();
                j = false;

                System.out.println("");
            }
        }
    }
}
