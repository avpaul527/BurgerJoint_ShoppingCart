import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private static States state;
    //public List<ShoppingCart> items = new ArrayList<>();
    public ShoppingCart shoppingCart;
    public  Customer(){

    }

    public Customer(String name, States state, ShoppingCart shoppingCart) {
        this.name = name;
        this.state = state;
        this.shoppingCart = shoppingCart;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void getItemss(ShoppingCart shoppingCart){
        System.out.println(String.valueOf(shoppingCart));
    }
}
