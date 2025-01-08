import java.util.ArrayList;
import java.util.List;

public class TwoDListExample {
    public static void main(String[] args) {
        
        // Initialize the 2D list
        List<List<Integer>> twoDList = new ArrayList<>();

        // Add first row
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        twoDList.add(row1);

        // Add second row
        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        twoDList.add(row2);

        // Print the 2D list
        for (List<Integer> row : twoDList) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
