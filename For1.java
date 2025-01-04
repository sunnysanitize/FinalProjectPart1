import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        int times = 3;
        for (int i = 0; i < times; i++) {
            number -= 20;
            System.out.println(number);
        }

        scanner.close();
    }
}
