import java.util.Scanner;

public class Nested2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter the weight of the package in kilograms: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter the length of the package in centimeters: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the package in centimeters: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height of the package in centimeters: ");
        double height = scanner.nextDouble();

        double volume = length * width * height;

        if (weight <= 27) {
            if (volume <= 100000) {
                System.out.println("Package meets requirements.");
            } else if (volume >= 100000) {
                System.out.println("Package is too large");
            }
        }

        if (weight > 27) {
            if (volume <= 100000) {
                System.out.println("Package is too heavy");
            } else if (volume >= 100000) {
                System.out.println("Package is both too heavy and too large.");
            }
        }
    }
}
