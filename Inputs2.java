import java.util.Scanner;
public class Inputs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first score: "); 
        int score1  = scanner.nextInt(); 
        System.out.print("Enter the second score: "); 
        int score2 = scanner.nextInt(); 
        System.out.print("Enter the third score: "); 
        int score3 = scanner.nextInt();

        int average = (score1 + score2 + score3) / 3;

        System.out.println("The average score is : " + average);
    }
}
