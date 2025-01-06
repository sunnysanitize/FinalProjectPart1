// Imports scanner
import java.util.Scanner;

public class Compound1 {
    public static void main(String[] args) {
        // Initializing a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Yes or no, does the computer beep?: ");

        // Reading the user input
        String beeps = scanner.nextLine();

        // Prompting the user input
        System.out.print("Yes or no, does the harddrive spin?: ");

        // Reading the user input
        String spins = scanner.nextLine();

        // Decision making using if statements
        if (beeps.equalsIgnoreCase("Yes") && spins.equalsIgnoreCase("Yes")) {
            System.out.println("Contact tech support");
        } else if (beeps.equalsIgnoreCase("Yes") && spins.equalsIgnoreCase("No")) {
            System.out.println("Check drive contacts");
        } else if (beeps.equalsIgnoreCase("No") && spins.equalsIgnoreCase("Yes")) {
            System.out.println("Check the speaker connections");
        } else if (beeps.equalsIgnoreCase("No") && spins.equalsIgnoreCase("No")) {
            System.out.println("Bring computer to repair center");
        }
    }
}
