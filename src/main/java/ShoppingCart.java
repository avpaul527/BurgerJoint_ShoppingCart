import java.util.ArrayList;

public class ShoppingCart implements TaxOnOrders{
    private ArrayList<Item> items = new ArrayList<>();

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

    public ArrayList<Item> getItems(){
        return items;
    }

    public double


    @Override
    public double calculateStateTax(States state) {
        return 0;
    }
}
