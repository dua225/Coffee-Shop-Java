// Coffee.java
public class Coffee {

    // private fields (encapsulation)
    private String name;
    private double basePrice;
    private CupSize size;

    // Constructor
    public Coffee(String name, double basePrice, CupSize size) {
        this.name = name;
        this.basePrice = basePrice;
        this.size = size;
    }

    // Getter for coffee name
    public String getName() {
        return name;
    }

    // Getter for base price (without size)
    public double getBasePrice() {
        return basePrice;
    }

    // Getter for cup size
    public CupSize getSize() {
        return size;
    }

    // Calculate final price based on cup size
    public double getPrice() {
        return basePrice + size.getExtraPrice();
    }
}
