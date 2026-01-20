// Coffee.java
public class Coffee {

    // private fields (encapsulation)
    private String name; //coffee name
    private double OrigPrice; //base price without size
    private CupSize size; //stores cup size using enum CupSize

    // Constructor
    public Coffee(String name, double basePrice, CupSize size) {
        this.name = name;
        this.OrigPrice = basePrice;
        this.size = size;
    }

    // Getter for coffee name
    public String getName() {
        return name;
    }

    // Getter for base price (without size)
    public double getBasePrice() {
        return OrigPrice;
    }

    // Getter for cup size
    public CupSize getSize() {
        return size;
    }

    // Calculate final price based on cup size
    public double getPrice() {
        return OrigPrice + size.getExtraPrice();
    }
}
