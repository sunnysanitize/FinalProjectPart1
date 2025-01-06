// Imports scanner
import java.util.Scanner;
public class Inputs1 {
    public static void main(String[] args) {

        // Initialiing scanner
        Scanner scanner = new Scanner(System.in); 

        // Prompting user input
        System.out.print("Enter the first number: ");
        
        // Reading user input
        int number1 = scanner.nextInt(); 

        // Prompting user input
        System.out.print("Enter the second number: "); 

        // Reading user input
        int number2 = scanner.nextInt(); 

        // Operations
        int resultaddition = number1 + number2; 
        int resultsubtraction = number1 - number2;

        // Print statements
        System.out.println("The result of addition is: " + resultaddition);
        System.out.println("The result of subtraction is: " + resultsubtraction);
    }
}
