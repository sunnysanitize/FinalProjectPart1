// Imports scanner
import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Initializing loop variable
        int total = 1;
        
        // Looping
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the numbers: ");
            int numbers = scanner.nextInt();
            total *= numbers;
        }
        
        // Print statement
        System.out.println("The product of the four numbers is: " + total);
    }
}
