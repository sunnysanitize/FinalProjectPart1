// Imports scanner
import java.util.Scanner;

public class Functions3 {
    // Function to calculate centripetal acceleration
    public static void centAccel(double m, double r, double v) {
        
        // Calculations
        double forceC = m * ((v * v) / r);

        // Print
        System.out.println(forceC);
    }

    // Main function
    public static void main(String[] args) {

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("KG: ");

        // Read user input
        double m = scanner.nextDouble();

        // Prompt user input
        System.out.print("SPEED: ");

        // Read user input
        double v = scanner.nextDouble();

        // Loop
        for (int x = 10; x < 100; x += 5) {
            double r = x;
            centAccel(m, r, v);
        }
    }
}
