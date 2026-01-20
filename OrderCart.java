// OrderCart: stores ordered items, quantities, sizes and computes the bill.
import java.util.ArrayList;

public class OrderCart {
    // Fields
    private ArrayList<Coffee> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
    private ArrayList<Coffee.Size> sizes = new ArrayList<>();
    private double totalAmount = 0;

    // Adds an item to the order
    public void addItem(Coffee coffee, Coffee.Size size, int quantity) {
        items.add(coffee);
        sizes.add(size);
        quantities.add(quantity);
        totalAmount += coffee.getPrice(size) * quantity;
        System.out.println("Item added successfully!");
    }

    // Returns the current total
    public double calculateTotal() {
        return totalAmount;
    }

    // Displays the bill
    public void showBill() {
        System.out.println("\n----- YOUR BILL -----");
        for (int i = 0; i < items.size(); i++) {
            Coffee c = items.get(i);
            Coffee.Size s = sizes.get(i);
            int q = quantities.get(i);
            double unit = c.getPrice(s);
            System.out.println(c.getName() + " (" + s + ") x" + q + " = Rs:" + String.format("%.2f", unit * q));
        }
        System.out.println("Total Amount = Rs:" + String.format("%.2f", totalAmount));
        System.out.println("Thank you for visiting.");
    }
}
