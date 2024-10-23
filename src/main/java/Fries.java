public class Fries extends Item {
    public Fries() {
        super("Fries", 1.0, 1); // called superclass constructor and set default values
    }

    public Fries(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}
