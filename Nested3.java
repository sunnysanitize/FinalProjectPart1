// Imports scanner
import java.util.Scanner;

public class Nested3 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("How many copies?: ");

        // Reading user input
        int amount = scanner.nextInt();
        
        // Prompting user input
        System.out.print("Is the user prime? yes or no: ");

        // Reading user input
        String primeStatus = scanner.next().toLowerCase();

        // Discount
        double primeDiscount = 0.1;

        // Decisions, all things are calculated within the nested if statements
        if (primeStatus.equals("yes")) {

            if (amount >= 900 && amount < 1000) {
                double price = 0.27;
                System.out.println("Price per copy is " + price + ".");
                double result = amount * price;
                double resultAfterDiscount = result - (result * primeDiscount);
                System.out.println("The total price after discount is " + resultAfterDiscount);
            }

            else if (amount >= 1000) {
                double price = 0.25;
                System.out.println("Price per copy is " + price + ".");
                double result = amount * price;
                double resultAfterDiscount = result - (result * primeDiscount);
                System.out.println("The total price after discount is " + resultAfterDiscount);
            }
        } 

        else {

            if (amount >= 0 && amount <= 499) {
                double price = 0.30;
                System.out.println("Price per copy is " + price + ".");
                double result = amount * price;
                System.out.println("The total price is " + result);
            }
   
            else if (amount >= 500 && amount <= 749) {
                double price = 0.28;
                System.out.println("Price per copy is " + price + ".");
                double result = amount * price;
                System.out.println("The total price is " + result);
            }

            else if (amount >= 750 && amount <= 999) {
                double price = 0.27;
                System.out.println("Price per copy is " + price + ".");
                double result = amount * price;
                System.out.println("The total price is " + result);
            }

            else if (amount >= 1000) {
                double price = 0.25;
                System.out.println("Price per copy is " + price + ".");
                double result = amount * price;
                System.out.println("The total price is " + result);
            }
        }

    }
}
