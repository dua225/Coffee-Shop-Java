// Coffee.java(class where encapsulation is applied)
public class Coffee {

    // private fields (encapsulation)
    private String name; //coffee name
    private double OrigPrice; //orignal price without size
    private CupSize size; //stores cup size using enum CupSize

    // Constructor
    public Coffee(String name, double OrigPrice, CupSize size) {
        this.name = name;
        this.OrigPrice = OrigPrice;
        this.size = size;
    }

    // Getter for coffee name
    public String getName() {
        return name;
    }

    // Getter for original price (without size)
    public double getOrigPrice() {
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
