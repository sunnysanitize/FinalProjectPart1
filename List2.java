// Imports scanner and arrays
import java.util.Arrays;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args) {

        // Initializing array
        String[] array = { "1", "2", "3", "4", "5" };

        // Print statement
        System.out.println("Original array: " + Arrays.toString(array));

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter the replacement: ");

        // Reading user input
        String replacement = scanner.nextLine();

        // Replacing the third element
        array[2] = replacement;

        // Print statement
        System.out.println("Updated array: " + Arrays.toString(array));
    }
}
