import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        // Create a Scanner to read from standard input
        Scanner sc = new Scanner(System.in);
        
        // Read one integer from the input
        int n = sc.nextInt();
        
        // Print an n x n square of 'x's
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("x");
            }
            System.out.println(); // Move to the next line
        }
        
        sc.close();
    }
}