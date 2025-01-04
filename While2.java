import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int numbers = 0;

        while (true) {
            System.out.print("Input the numbers: ");
            int nums = scanner.nextInt();

            if (nums == 0) {
                break;
            }

            total += nums;

            numbers++;

            double average = (double) total / numbers;
            System.out.println(average);
        }

        scanner.close();
    }
}
