// Imports scanner
import java.util.Scanner;

public class Nested2 {
    public static void main(String[] args) {
        
        // Initializing scanner
        Scanner scanner = new Scanner(System.in);
  
        // Prompting user input
        System.out.print("Enter the weight of the package in kilograms: ");

        //  Reading user input
        double weight = scanner.nextDouble();
        
        // Prompting user input
        System.out.print("Enter the length of the package in centimeters: ");

        // Reading user input
        double length = scanner.nextDouble();

        // Prompting user input
        System.out.print("Enter the width of the package in centimeters: ");

        // Reading user input
        double width = scanner.nextDouble();
        
        // Prompting user input
        System.out.print("Enter the height of the package in centimeters: ");

        // Reading user input
        double height = scanner.nextDouble();

        // Operations
        double volume = length * width * height;

        // Decisions
        if (weight <= 27) {
            if (volume <= 100000) {
                System.out.println("Package meets requirements.");
            } else if (volume >= 100000) {
                System.out.println("Package is too large");
            }
        }

        if (weight > 27) {
            if (volume <= 100000) {
                System.out.println("Package is too heavy");
            } else if (volume >= 100000) {
                System.out.println("Package is both too heavy and too large.");
            }
        }
    }
}
