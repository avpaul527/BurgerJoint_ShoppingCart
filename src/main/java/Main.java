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


        Item burger = new Burger();
        Item fries = new Fries();
        Item soda = new Soda();


        burger.setQuantity(qtyBurger);
        fries.setQuantity(qtyFries);
        soda.setQuantity(qtySoda);


        ShopUtility.priceCheck(burger, fries, soda);

        ShopUtility.removeCart(burger, fries, soda);


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