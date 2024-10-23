import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.println("How many burgers would you like?");//burger
        int qtyBurger = scanner.nextInt();



        System.out.println("How many fries would you like?");//fries
        int qtyFries = scanner.nextInt();



        System.out.println("How many sodas would you like");//soda
        int qtySoda = scanner.nextInt();



        Item burger = new Burger("Burger", 0, 0);
        Item fries = new Fries("Fries", 0, 0);
        Item soda = new Soda("Soda", 0, 0);



        burger.setQuantity(qtyBurger);
        fries.setQuantity(qtyFries);
        soda.setQuantity(qtySoda);


        getPriceForItem(burger,fries,soda);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(burger, burger.getQuantity());
        shoppingCart.addItem(fries, fries.getQuantity());
        shoppingCart.addItem(soda, soda.getQuantity());

        Customer customer = new Customer("Mike", States.Pennsylvania, shoppingCart);
        customer.printItems();
        System.out.println(" ");
        System.out.println("\nReceipt for Customer 1 below:\n");
        ShopUtility.printReceipt(customer);


        Customer customer2 = new Customer("hamlin", States.Delaware, shoppingCart);
        System.out.println(" ");
        System.out.println("\nReceipt for Customer 2 below:\n");

        ShopUtility.printReceipt(customer2);
    }

    public static void getPriceForItem(Item burger, Item fries, Item soda) {
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
}