import java.util.Scanner;
public class Inputs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: "); 
        int number1 = scanner.nextInt(); 
        System.out.print("Enter the second number: "); 
        int number2 = scanner.nextInt(); 
        int resultaddition = number1 + number2; 
        int resultsubtraction = number1 - number2;
        System.out.println("The result of addition is: " + resultaddition);
        System.out.println("The result of subtraction is: " + resultsubtraction);
    }
}
