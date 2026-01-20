// CoffeeShop: A simple terminal-based coffee ordering system.
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create menu (Coffee objects)
        Coffee espresso = new Coffee("Espresso", 250);
        Coffee cappuccino = new Coffee("Cappuccino", 300);
        Coffee latte = new Coffee("Latte", 350);
        Coffee mocha = new Coffee("Mocha", 400);
        Coffee americano = new Coffee("Americano", 200);
        Coffee frenchVanilla = new Coffee("French Vanilla", 280);

        Coffee[] menu = {espresso, cappuccino, latte, mocha, americano, frenchVanilla};

        // Create order
        OrderCart myOrder = new OrderCart();

        System.out.println("Welcome to My Coffee Shop");

        boolean ordering = true;
        while (ordering) {
            // Display menu
            System.out.println("\n--- Menu ---");
            for (int i = 0; i < menu.length; i++) {
                Coffee c = menu[i];
                System.out.println((i + 1) + ". " + c.getName() + " - Rs(S/M/L): "
                        + (int) c.getPrice(Coffee.Size.SMALL) + "/"
                        + (int) c.getPrice(Coffee.Size.MEDIUM) + "/"
                        + (int) c.getPrice(Coffee.Size.LARGE));
            }

            System.out.print("Enter your choice (1-" + menu.length + "): ");
            int choice = sc.nextInt();
            if (choice < 1 || choice > menu.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            if (qty <= 0) {
                System.out.println("Quantity must be at least 1. Please try again.");
                continue;
            }

            System.out.println("Choose size: 1. Small  2. Medium  3. Large");
            int sizeChoice = sc.nextInt();
            Coffee.Size chosenSize;
            switch (sizeChoice) {
                case 2:
                    chosenSize = Coffee.Size.MEDIUM;
                    break;
                case 3:
                    chosenSize = Coffee.Size.LARGE;
                    break;
                default:
                    chosenSize = Coffee.Size.SMALL;
                    break;
            }

            myOrder.addItem(menu[choice - 1], chosenSize, qty);

            System.out.print("Do you want to order more items? (yes/no): ");
            String more = sc.next();
            if (more.equalsIgnoreCase("no")) {
                ordering = false;
            }
        }

        // Show final bill
        myOrder.showBill();

        sc.close();
    }
}
