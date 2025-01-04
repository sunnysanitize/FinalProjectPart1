import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 1;
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the numbers: ");
            int numbers = scanner.nextInt();
            total *= numbers;
        }
        
        System.out.println("The product of the four numbers is: " + total);
        
        scanner.close();
    }
}
