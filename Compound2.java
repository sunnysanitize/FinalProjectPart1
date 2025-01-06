// Imports scanner
import java.util.Scanner;

public class Compound2 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter number between 1 and 100: ");

        // Reading user input
        int number = scanner.nextInt();

        // Decisions based on user input
        if (number % 10 == 0) {
            System.out.println("Criteria A");
        } else if (number % 5 == 0 || number < 40) {
            System.out.println("Criteria B");
        } else if (number < 60) {
            System.out.println("Criteria C");
        } else {
            System.out.println("Does not match any Criteria");
        }
    }
}
