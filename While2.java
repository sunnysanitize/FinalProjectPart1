// Imports scanner
import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);
        
        // Initializing total and numbers
        int total = 0;
        int numbers = 0;

        // Looping, using while loop for continous input
        while (true) {

            // Prompting user input
            System.out.print("Input the numbers: ");

            // Reading user input
            int nums = scanner.nextInt();

            // Base case to stop 
            if (nums == 0) {
                break;
            }

            // Operations
            total += nums;

            numbers++;

            double average = (double) total / numbers;

            // Print statement
            System.out.println(average);
        }
    }
}
