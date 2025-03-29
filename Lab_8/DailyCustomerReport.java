// Removed package declaration to match the directory structure

import java.util.*;

public class DailyCustomerReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of customers for the current day: ");
        int customerAmount = Integer.parseInt(input.nextLine()); //use parseInt() on nextLine() instead of directly using nextInt() to avoid bugs with following use of nextLine()
        Customer[] customers = new Customer[customerAmount];
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < customerAmount; i++) {
            System.out.print("Enter customer\'s name: ");
            String customerName = input.nextLine();
            System.out.print("Enter the customer\'s purchases cost: ");
            double customerPurchasesCost = Double.parseDouble(input.nextLine()); //use parseDouble() on nextLine() instead of directly using nextDouble() to avoid bugs with following use of nextLine()
            System.out.print("Enter the customer\'s type (V for VIP, R for Regular, and N for New): ");

            boolean validCustomerType = false;
            while (!validCustomerType) {
                
                String customerType = input.nextLine(); // keep customerType as String to later verify whether user input is
                                                        // valid

                switch (customerType) {
                    case ("V"):
                    case ("v"):
                        customers[i] = new VIP(customerName, customerPurchasesCost);
                        validCustomerType = true;
                        break;
                    case ("R"):
                    case ("r"):
                        customers[i] = new Regular(customerName, customerPurchasesCost);
                        validCustomerType = true;
                        break;
                    case ("N"):
                    case ("n"):
                        customers[i] = new New(customerName, customerPurchasesCost);
                        validCustomerType = true;
                        break;
                    default:
                        System.out.print("Invalid customer type. Enter the customer\'s type (V for VIP, R for Regular, and N for New): ");
                        break;
                }
            }
            System.out.println("--------------------------------------------------------------------");
        }

        double dailyCosts = 0;
        for (Customer customer : customers) {
            if (customer instanceof VIP) {
                System.out.println("Congratulations for the next customer. You Won " + ((VIP) customer).GiftCertificate() + " SR. gift certificate.");
                System.out.println("VIP " + ((VIP) customer).toString());
                dailyCosts += ((VIP) customer).getPurchasesCost();
            } else if (customer instanceof Regular) {
                System.out.println("Regular " + ((Regular) customer).toString());
                dailyCosts += ((Regular) customer).getPurchasesCost();
            } else if (customer instanceof New) {
                System.out.println("New " + ((New) customer).toString());
                dailyCosts += ((New) customer).getPurchasesCost();
            }
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Current day income = " + dailyCosts + " SR.");
        System.out.println("--------------------------------------------------------------------");

        input.close();
    }
    
}
