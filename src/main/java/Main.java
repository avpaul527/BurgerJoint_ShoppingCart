public class Main {
    public static void main(String[] args) {
        Item burger = new Burger("Burger", 4.0, 3);
        Item fries = new Fries("Fries", 1.0, 4);
        Item soda = new Soda("Soda", 0.5, 2);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(burger, burger.getQuantity());
        shoppingCart.addItem(fries, fries.getQuantity());
        shoppingCart.addItem(soda, soda.getQuantity());

        Customer customer = new Customer("Mike", States.Pennsylvania, shoppingCart);
        customer.printItems();
        System.out.println(" ");
        ShopUtility.printReceipt(customer);


        Customer customer2 = new Customer("hamlin", States.Delaware, shoppingCart);
        System.out.println(" ");
        System.out.println("Receipt for Customer 2 below");

        ShopUtility.printReceipt(customer2);
    }
}