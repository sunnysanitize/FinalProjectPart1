// Imports scanner
import java.util.Scanner;

public class Functions1 {
    public static void main(String[] args) {
        
        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("num1= ");

        // Reading user input
        int num1 = scanner.nextInt();
        
        // Prompting user input
        System.out.print("num2= ");

        // Reading user input
        int num2 = scanner.nextInt();
        
        // Prompting user input
        System.out.print("num3= ");

        // Reading user input
        int num3 = scanner.nextInt();

        // Function call and print statement
        int max = maxNum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    // Function to find the maximum number
    public static int maxNum(int num1, int num2, int num3) {

        // Decisions and return statements
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
