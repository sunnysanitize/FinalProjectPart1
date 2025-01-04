import java.util.Arrays;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args) {

        String[] array = { "1", "2", "3", "4", "5" };

        System.out.println("Original array: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the replacement: ");
        String replacement = scanner.nextLine();

        array[2] = replacement;

        System.out.println("Updated array: " + Arrays.toString(array));
    }
}
