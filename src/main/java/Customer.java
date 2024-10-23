public class Customer {
    public String name;
    public static States state;

    public  Customer(){

    }

    public Customer(String name, States state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }
}
