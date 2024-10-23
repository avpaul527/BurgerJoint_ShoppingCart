import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item burger = new Burger("Burger", 4, 3);
        Item fries = new Fries("Fries", 1, 4);
        Item soda = new Soda("Soda", .5, 2);



        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(burger, burger.getQuantity());
        shoppingCart.addItem(fries, fries.getQuantity());
        shoppingCart.addItem(soda, soda.getQuantity());



        Customer customer = new Customer("Mike", States.Delaware, shoppingCart);

        customer.getItemss(shoppingCart);
        ShopUtility.printReceipt(customer);


    }

}
