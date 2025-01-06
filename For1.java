// Imports scanner
import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {

        // Initilizing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Number: ");

        // Reading user input
        int number = scanner.nextInt();

        // Initializing loop
        int times = 3;

        // Looping
        for (int i = 0; i < times; i++) {
            number -= 20;

            // Print statement
            System.out.println(number);
        }
    }
}
