import java.util.Scanner;
public class Inputs3 {
    public static void main(String[] args) {
        System.out.println("\nThis program is called the denary converter.");
        System.out.println("It allows the user to enter a value in base 7");
        System.out.println("and will convert it to its base 10 equivalent.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the number in base 7?: ");
        String numberEntered = scanner.nextLine();

        int convertedNumber = Integer.parseInt(numberEntered, 7);

        System.out.println("\nThe number you have entered in base 7 is " + numberEntered);
        System.out.println("That number in base 10 is " + convertedNumber);
    }
}
