public class p2{
    public static void main(String[] args) {
        // Outer loop for the rows
        for (int i = 0; i < 4; i++) {
            
            // Inner loop for the columns (prints '*' on the same line)
            for (int j = 0; j < 4; j++) {
                System.out.print("*"); 
            }
            
            // This moves to the next line after a row is complete
            System.out.println(); 
        }
    }
}