// Imports scanner
import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Vertical Measure: ");

        // Reading user input
        int verticalMeasure = scanner.nextInt();

        // Prompting user input
        System.out.print("Horizontal Measure: ");

        // Reading user input
        int horizontalMeasure = scanner.nextInt();

        // Nested loop
        for (int i = 0; i < verticalMeasure; i++) {
            String line = "";

            for (int j = 0; j < horizontalMeasure; j++) {
                line += "*";
            }

            // Print statement
            System.out.println(line);
        }
    }
}
