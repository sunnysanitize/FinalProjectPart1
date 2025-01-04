import java.util.Scanner;

public class Conditionals3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        System.out.println("Checking if " + number + " is greater than 10");

        if (number > 10) {
            System.out.println("Success");
        }
        System.out.println("Done checking");
    }
}
