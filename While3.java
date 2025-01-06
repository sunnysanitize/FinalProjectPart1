// Imports random and scanner
import java.util.Random;
import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {

        // Random number generator
        Random random = new Random();

        // Random number between 1 and 50
        int correctValue = random.nextInt(50) + 1;

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Looping
        while (true) {
            System.out.print("Input digits: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer > correctValue) {
                System.out.println("Too high");
            } else if (userAnswer < correctValue) {
                System.out.println("Too low");
            } else {
                System.out.println("You guessed correctly!");
                break; 
            }
        }
    }
}
