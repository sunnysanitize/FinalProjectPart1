import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: "); 
        int number1 = scanner.nextInt(); 
        System.out.print("Enter the second number: "); 
        int number2 = scanner.nextInt(); 
        int result = number1 + number2; 
        System.out.println("The result of addition is: " + result);
    }
}
