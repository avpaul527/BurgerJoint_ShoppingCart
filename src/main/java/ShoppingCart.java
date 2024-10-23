import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements TaxOnOrders {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item, int quantity) {
        if (item.isInStock(quantity)) {
            item.setQuantity(quantity);
            items.add(item);
        } else {
            System.out.println(item.getName() + " does not have enough in stock");
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double totalNoTax() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity(); //Changed to account for quantity instead
        }
        return total;
    }

    @Override
    public double calculateStateTax(States state) {
        double taxRate = state.getTaxRate();
        return totalNoTax() * taxRate;
    }

    public double calculateFinalTotal(Customer customer) {
        return totalNoTax() + calculateStateTax(customer.getState());
    }

    public void printItems() {
        for (Item item : getItems()) {
            System.out.println(item);
        }
    }
}