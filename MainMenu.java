// CoffeeShop: A simple terminal-based coffee ordering system.
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create order cart
        OrderCart myOrder = new OrderCart();

        System.out.println("\n Welcome to Brew Coffee !!\n " + "Enjoy the best coffee in town!");

        boolean ordering = true; // starting order loop
        while (ordering) {

            // Display the menu
            System.out.println("\n--- Our Menu ---");
            System.out.println("1. Espresso - Rs: 250");
            System.out.println("2. Cappuccino - Rs: 300");
            System.out.println("3. Latte - Rs: 350");
            System.out.println("4. Mocha - Rs: 400");
            System.out.println("5. Americano - Rs: 200");
            System.out.println("6. French Vanilla - Rs: 280");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 6) { // invalid choice handling
                System.out.println("Invalid choice, please try again!");
                continue;
            }
            // Cup size selection
            System.out.println("\nSelect Your Desired Cup Size:");
            System.out.println("1. Small");
            System.out.println("2. Medium (+50)");
            System.out.println("3. Large (+100)");
            System.out.print("Enter size choice: ");
            int sizeChoice = sc.nextInt();

            CupSize size;
            try {
                if (sizeChoice == 1) {
                    size = CupSize.SMALL;
                } else if (sizeChoice == 2) {
                    size = CupSize.MEDIUM;
                } else if (sizeChoice == 3) {
                    size = CupSize.LARGE;
                } else {
                    throw new IllegalArgumentException("Invalid cup size selected!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid cup size, please try again!");
                continue; // go back to start of loop
            }
            System.out.print("Enter desired quantity: ");
            int qty = sc.nextInt();

            Coffee selectedCoffee; // variable to store selected coffee item
            if (choice == 1) {
                selectedCoffee = new Coffee("Espresso", 250, size);
            } else if (choice == 2) {
                selectedCoffee = new Coffee("Cappuccino", 300, size);
            } else if (choice == 3) {
                selectedCoffee = new Coffee("Latte", 350, size);
            } else if (choice == 4) {
                selectedCoffee = new Coffee("Mocha", 400, size);
            } else if (choice == 5) {
                selectedCoffee = new Coffee("Americano", 200, size);
            } else {
                selectedCoffee = new Coffee("French Vanilla", 280, size);
            }
            // Adding to order
            myOrder.addItem(selectedCoffee, qty);

            System.out.print("Do you want to order more items? (yes/no): ");
            String moreitems = sc.next();

            if (moreitems.equalsIgnoreCase("no")) { // avoid case sensitivity issues
                ordering = false;
            }
        }
        // Show final bill
        myOrder.showBill();

        sc.close();
    }
}