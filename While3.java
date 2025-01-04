import java.util.Random;
import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {

        Random random = new Random();

        int correctValue = random.nextInt(50) + 1;

        Scanner scanner = new Scanner(System.in);

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
