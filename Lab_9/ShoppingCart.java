import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Items> cart = new ArrayList<Items>(); //leave brackets empty since documentation specified empty ArrayList
        
        Scanner input = new Scanner(System.in);
        
        do {
            cart.add(addItem(input));
        } while (continueShopping());
        
        printCart(cart);
        
        input.close();
    }
    
    public static boolean continueShopping(Scanner input) {
        while (true) {
            System.out.print("Continue shopping (y/n) ? ");
            
            String userAnswer = input.nextLine();
            switch (userAnswer) {
                case ("y"):
                case ("Y"):
                    return true;
                case ("n"):
                case ("N"):
                    return false;
                default:
                    System.out.print("Invalid input. ");
            }
        }
    }
    
    public static Items addItem(Scanner input) {
        System.out.print("Enter the name of the item: ");
        String itemName = input.nextLine();
        
        System.out.print("Enter the unit price: ");
        double unitPrice = Double.parseDouble(input.nextLine()); //use the wrapper class to use nextLine() in order to consume whole input in a single line
                                                                 //instead of using nextDouble() then nextLine()
        
        System.out.print("Enter the quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        
        return Items(itemName, unitPrice, quantity);
    }
    
    public static void printCart(ArrayList<Items> cart) {
        double cartTotal = 0;
        
        System.out.println("\nFinal Shopping Cart Totals");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s", "ItemName", "Unit Price", "Quantity", "Price * Quantity");
        
        for (Items item : cart) {
            double unitTotal = item.getUnitPrice() * item.getQuantity();
            System.out.printf("%-20s %-20.1f %-20d %-20.1f", item.getItemName(), item.getUnitPrice(), item.getQuantity(), unitTotal);
            
            cartTotal += unitTotal;
        }
        
        System.out.println("Total amount in the cart: " + cartTotal + " SR");
    }
}
