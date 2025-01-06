// Imports scanner
import java.util.Scanner;

public class Functions2 {
    // Function to calculate cost 
    public static double calculateCost(String code) {

        // Cost values
        double I = 1.50;
        double S = 3.50;
        double T = 5.50;
        double W = 12.50;

        // Convert input to uppercase
        String upperCode = code.toUpperCase();

        // Decisions
        if (upperCode.equals("I")) {
            return I;
        } else if (upperCode.equals("S")) {
            return S;
        } else if (upperCode.equals("T")) {
            return T;
        } else if (upperCode.equals("W")) {
            return W;
        } else {
            // Invalid code
            return -1;
        }
    }

    // Main function
    public static void main(String[] args) {
        
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Input the letter: ");

        // Read user input
        String code = scanner.nextLine();

        // Function call 
        double cost = calculateCost(code);

        // Decisions
        if (cost == -1) {
            System.out.println("Invalid code rating!");
        } else {
            System.out.println("cost associated with the code rating is " + cost);
        }
    }
}
