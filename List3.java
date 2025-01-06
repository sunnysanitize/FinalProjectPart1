// Imports scanner and arrays
import java.util.Arrays;
import java.util.Scanner;

public class List3 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Initializing array
        int[] array = new int[15];

        // Looping to get user input
        for (int i = 0; i < 15; i++) {

            // Prompting user input
            System.out.print("Integers: ");

            // Reading user input
            int integerInput = scanner.nextInt();

            // Appending to array 
            array[i] = integerInput;
        }

        // Print statement
        System.out.println("Original Array: " + Arrays.toString(array));

        // Prompting user input
        System.out.print("Location: ");

        // Reading user input
        int replacementLocation = scanner.nextInt();

        // Prompting user input 
        System.out.print("Replacement: ");

        // Reading user input   
        int replacementInteger = scanner.nextInt();

        // Replacing the element
        array[replacementLocation - 1] = replacementInteger;

        // Print statement
        System.out.println("Updated Array: " + Arrays.toString(array));
    }
}
