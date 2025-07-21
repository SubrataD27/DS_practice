import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
         for (int i = 0; i < n; i++) {
            
            // Prints the leading spaces for the inverted shape
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Prints the asterisks; the count decreases in each row
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            // Moves to the next line to start a new row
            System.out.println();
        }
    }
}