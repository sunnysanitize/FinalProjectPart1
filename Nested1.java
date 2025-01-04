import java.util.Scanner;

public class Nested1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yes or no, does the computer beep?: ");
        String beeps = scanner.nextLine();

        System.out.print("Yes or no, does the harddrive spin?: ");
        String spins = scanner.nextLine();

        if (beeps.equals("Yes")) {
            if (spins.equals("Yes")) {
                System.out.println("Contact tech support");
            } else if (spins.equals("No")) {
                System.out.println("Check drive contacts");
            }
        } else if (beeps.equals("No")) {
            if (spins.equals("Yes")) {
                System.out.println("Check the speaker connections");
            } else if (spins.equals("No")) {
                System.out.println("Bring computer to repair center");
            }
        }
    }
}
