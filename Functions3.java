import java.util.Scanner;

public class Functions3 {

    public static void centAccel(double m, double r, double v) {
        double forceC = m * ((v * v) / r);
        System.out.println(forceC);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("KG: ");
        double m = scanner.nextDouble();

        System.out.print("SPEED: ");
        double v = scanner.nextDouble();

        for (int x = 10; x < 100; x += 5) {
            double r = x;
            centAccel(m, r, v);
        }
    }
}
