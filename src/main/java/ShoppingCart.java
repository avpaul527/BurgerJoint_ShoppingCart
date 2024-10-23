import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements TaxOnOrders{
    private List<Item> items = new ArrayList<>();
   // private List<ShoppingCart> shoppingCarts = new ArrayList<>();



    public void addItem(Item item, int quantity){
        if (item.isInStock(quantity)) {
            item.setQuantity(quantity);
            items.add(item);
        } else {
            System.out.println(item.getName() + "does not have enough in stock");
        }
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public List<Item> getItems(){
        return items;

    }

    public double totalNoTax(){
        double total = 0;
        for (Item item : items){
            total = total + item.getPrice();
        }
        return total;
    }


    @Override
    public double calculateStateTax(States state) {
        double total = totalNoTax();
        double taxRate = state.getTaxRate();
        return total * taxRate;
    }

    public double calculateFinalTotal(Customer customer){
        double subtotal = totalNoTax();
        double stateTax = calculateStateTax(customer.getState());
        return subtotal + stateTax;

    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void printItems(ShoppingCart customer){
       for(var i : getItems()){
           System.out.println(i);
       }

    }

}
