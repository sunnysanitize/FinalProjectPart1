public class NestedLoop3 {
    public static void main(String[] args) {
        
        // Initialize variable
        int ways = 0;

        // Looping and logic
        for (int die1 = 0; die1 < 6; die1++) {
            for (int die2 = 0; die2 < 6; die2++) {
                int sum = (die1 + 1) + (die2 + 1);

                if (sum == 3 || sum == 4 || sum == 12) {
                    System.out.println((die1 + 1) + " + " + (die2 + 1) + " = " + sum);
                    ways++;
                }
            }
        }

        // Print statement
        System.out.println("There are " + ways + " ways to add to those numbers.");
    }
}
