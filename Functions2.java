import java.util.Scanner;

public class Functions2 {

    public static double calculateCost(String code) {
        double I = 1.50;
        double S = 3.50;
        double T = 5.50;
        double W = 12.50;

        String upperCode = code.toUpperCase();

        switch (upperCode) {
            case "I":
                return I;
            case "S":
                return S;
            case "T":
                return T;
            case "W":
                return W;
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the letter: ");
        String code = scanner.nextLine();

        double cost = calculateCost(code);

        if (cost == -1) {
            // Handle invalid code
            System.out.println("Invalid code rating!");
        } else {
            // Valid code; print cost
            System.out.println("cost associated with the code rating is " + cost);
        }
        
        scanner.close();
    }
}
