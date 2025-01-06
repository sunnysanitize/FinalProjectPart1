// Imports scanner
import java.util.Scanner;

public class Nested1 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Yes or no, does the computer beep?: ");

        // Reading user input
        String beeps = scanner.nextLine();

        // Prompting user input
        System.out.print("Yes or no, does the harddrive spin?: ");

        // Reading user input
        String spins = scanner.nextLine();

        // Decisions
        if (beeps.equals("Yes")) {
            if (spins.equals("Yes")) {
                System.out.println("Contact tech support");
            } else if (spins.equals("No")) {
                System.out.println("Check drive contacts");
            }
        } else if (beeps.equals("No")) {
            if (spins.equals("Yes")) {
                System.out.println("Check the speaker connections");
            } else if (spins.equals("No")) {
                System.out.println("Bring computer to repair center");
            }
        }
    }
}
