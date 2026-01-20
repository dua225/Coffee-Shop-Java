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

        System.out.println(" Welcome to My Coffee Shop ");

        boolean ordering = true;
        while (ordering) {
            // Display menu
            System.out.println("\n--- Menu: ---");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i+1) + ". " + menu[i].getName() + " - Rs: " + menu[i].getPrice());
            }

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if(choice < 1 || choice > menu.length){
                System.out.println("Invalid choice,Please try again!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            // Add to order
            myOrder.addItem(menu[choice-1], qty);

           System.out.print("Do you want to order more items? (yes/no): ");
           String more = sc.next();  // reads whole word
           if(more.equalsIgnoreCase("no")){
        ordering = false;
}

        }

        // Show final bill
        myOrder.showBill();

        sc.close();
    }
}
