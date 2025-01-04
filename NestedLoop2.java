import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vertical Measure: ");
        int verticalMeasure = scanner.nextInt();

        System.out.print("Horizontal Measure: ");
        int horizontalMeasure = scanner.nextInt();

        for (int i = 0; i < verticalMeasure; i++) {
            String line = "";

            for (int j = 0; j < horizontalMeasure; j++) {
                line += "*";
            }
            System.out.println(line);
        }

        scanner.close();
    }
}
