// Imports scanner
import java.util.Scanner;

public class Conditionals3 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter a number: ");

        // Reading user input
        double number = scanner.nextDouble();

        // Print statement
        System.out.println("Checking if " + number + " is greater than 10");

        // Decisions
        if (number > 10) {
            System.out.println("Success");
        }
        System.out.println("Done checking");
    }
}
