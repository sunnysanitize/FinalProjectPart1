// Imports scanner
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("second number: ");
        int secondNumber = scanner.nextInt();

        // Loop from firstNumber up to and including secondNumber
        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
