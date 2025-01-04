import java.util.Scanner;

public class Functions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("num1= ");
        int num1 = scanner.nextInt();
        
        System.out.print("num2= ");
        int num2 = scanner.nextInt();
        
        System.out.print("num3= ");
        int num3 = scanner.nextInt();

        int max = maxNum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }

    public static int maxNum(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
