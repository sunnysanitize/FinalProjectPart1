import java.util.Scanner;

public class Compound3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("What is your experience: ");
        String experience = scanner.nextLine().trim();
        
        // Evaluate conditions
        if (age < 16) {
            System.out.println("You are ineligible");
        } 
        else if (age >= 16 && age <= 25 && experience.equals("N")) {
            System.out.println("Admission is $2.00");
        } 
        else if (age >= 16 && age <= 25 && experience.equals("E")) {
            System.out.println("Admission is $1.50");
        } 
        else if (age >= 16 && age <= 25 && experience.equals("M")) {
            System.out.println("Admission is $1.00");
        } 
        else if (age >= 26 && age <= 60 && experience.equals("N")) {
            System.out.println("Admission is $1.50");
        } 
        else if (age >= 26 && age <= 60 && experience.equals("E")) {
            System.out.println("Admission is $1.00");
        } 
        else if (age >= 26 && age <= 60 && experience.equals("M")) {
            System.out.println("Admission is $0.75");
        } 
        else if (age > 60 && experience.equals("N")) {
            System.out.println("Admission is $0.90");
        } 
        else if (age > 60 && (experience.equals("E") || experience.equals("M"))) {
            System.out.println("Admission is $0.75");
        }
    }
}
