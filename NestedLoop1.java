public class NestedLoop1 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Good " + (i + 1));
            
            for (int x = 0; x < 3; x++) {
                System.out.println("Dog " + (x + 1));
            }
        }
    }
}
