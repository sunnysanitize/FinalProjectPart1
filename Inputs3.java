// Imports scanner
import java.util.Scanner;
public class Inputs3 {
    public static void main(String[] args) {
        
        // Explaining the program
        System.out.println("\nThis program is called the denary converter.");
        System.out.println("It allows the user to enter a value in base 7");
        System.out.println("and will convert it to its base 10 equivalent.\n");

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("What is the number in base 7?: ");

        // Read user input
        String numberEntered = scanner.nextLine();

        // Convert the number to base 10 
        int convertedNumber = Integer.parseInt(numberEntered, 7);

        // Print statements
        System.out.println("\nThe number you have entered in base 7 is " + numberEntered);
        System.out.println("That number in base 10 is " + convertedNumber);
    }
}
