import java.util.Arrays;
import java.util.Scanner;

public class List3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Integers: ");
            int integerInput = scanner.nextInt();
            array[i] = integerInput;
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.print("Location: ");
        int replacementLocation = scanner.nextInt();

        System.out.print("Replacement: ");
        int replacementInteger = scanner.nextInt();

        array[replacementLocation - 1] = replacementInteger;

        System.out.println("Updated Array: " + Arrays.toString(array));
    }
}
