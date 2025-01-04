import java.util.Scanner;

public class Compound1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yes or no, does the computer beep?: ");
        String beeps = scanner.nextLine().trim();

        System.out.print("Yes or no, does the harddrive spin?: ");
        String spins = scanner.nextLine().trim();

        if (beeps.equalsIgnoreCase("Yes") && spins.equalsIgnoreCase("Yes")) {
            System.out.println("Contact tech support");
        } else if (beeps.equalsIgnoreCase("Yes") && spins.equalsIgnoreCase("No")) {
            System.out.println("Check drive contacts");
        } else if (beeps.equalsIgnoreCase("No") && spins.equalsIgnoreCase("Yes")) {
            System.out.println("Check the speaker connections");
        } else if (beeps.equalsIgnoreCase("No") && spins.equalsIgnoreCase("No")) {
            System.out.println("Bring computer to repair center");
        }
    }
}
