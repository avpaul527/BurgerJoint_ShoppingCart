import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many burgers would you like?");//burger
        int qtyBurger = scanner.nextInt();

        System.out.println("Burger Cost?");
        double burgerPrice = scanner.nextDouble();

        System.out.println("How many fries would you like?");//fries
        int qtyFries = scanner.nextInt();

        System.out.println("Fries Cost?");
        double friesPrice = scanner.nextDouble();

        System.out.println("How many sodas would you like");//soda
        int qtySoda = scanner.nextInt();

        System.out.println("Soda Cost?");
        double sodaPrice = scanner.nextDouble();

        Item burger = new Burger("Burger", 0, 0);
        Item fries = new Fries("Fries", 0, 0);
        Item soda = new Soda("Soda", 0, 0);

        burger.setPrice(burgerPrice);
        fries.setPrice(friesPrice);
        soda.setPrice(sodaPrice);

        burger.setQuantity(qtyBurger);
        fries.setQuantity(qtyFries);
        soda.setQuantity(qtySoda);


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
}