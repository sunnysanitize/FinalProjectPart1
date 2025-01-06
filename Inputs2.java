// Imports scanner
import java.util.Scanner;
public class Inputs2 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in); 

        // Prompting user input
        System.out.print("Enter the first score: "); 

        // Reading user input
        int score1  = scanner.nextInt(); 

        // Prompting user input
        System.out.print("Enter the second score: "); 

        // Reading user input
        int score2 = scanner.nextInt(); 

        // Prompting user input
        System.out.print("Enter the third score: "); 

        // Reading user input
        int score3 = scanner.nextInt();

        // Operations
        int average = (score1 + score2 + score3) / 3;

        // Print statement
        System.out.println("The average score is : " + average);
    }
}
