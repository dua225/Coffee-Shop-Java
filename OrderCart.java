// Order.java
import java.util.ArrayList;

public class OrderCart {
    // private fields : encapsulation
    private ArrayList<Coffee> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
    private double totalAmount = 0;

    // Method to add coffee to order
    public void addItem(Coffee coffee, int quantity) {
        items.add(coffee);
        quantities.add(quantity);
        totalAmount += coffee.getPrice() * quantity;
        System.out.println("Item added successfully!");
    }

    // Calculate total (can be called separately if needed)
    public double calculateTotal() {
        return totalAmount;
    }

    // Show bill
    public void showBill() {
        System.out.println("\n-----YOUR BILL: -----");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(
    items.get(i).getName() + " (" + items.get(i).getSize() + ") x" 
    + quantities.get(i) + " = Rs:" 
    + (items.get(i).getPrice() * quantities.get(i))
);

        System.out.println("Total Amount = Rs:" + totalAmount);
        System.out.println("Thank you for visiting our shop! Please Come Again :)");
    }
}
}
