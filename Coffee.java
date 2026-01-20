// Coffee.java
// Represents a coffee item with a base price and cup sizes.
public class Coffee {
    // Fields
    private String name;
    private double basePrice;

    // Cup sizes
    public enum Size { SMALL, MEDIUM, LARGE }

    // Constructor
    public Coffee(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    // Returns the coffee name
    public String getName() {
        return name;
    }

    // Returns the base price (small)
    public double getBasePrice() {
        return basePrice;
    }

    // Returns price adjusted for the given size
    public double getPrice(Size size) {
        switch (size) {
            case MEDIUM:
                return basePrice * 1.25;
            case LARGE:
                return basePrice * 1.5;
            case SMALL:
            default:
                return basePrice;
        }
    }
}
