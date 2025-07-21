// import java.util.Scanner;
// public class p1{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // Read the number of rows
//         for(int i = 0; i < n; i++)  //Outer loop for rows
//         //Inner loop for columns
//          {
//             for(int j = 0; j <i; j++) {
//                 System.out.print(j + " "); // Print the spaces
//             }
//             for(int j = 0; j <(2n-(2*i + 1)); j++)
//             {
//                 System.out.print("*"); // Print numbers in decreasing order
//             }
//             for(int j = 0; j <i; j++) {
//                 System.out.print(j + " "); // Print numbers in decreasing order
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//         sc.close(); // Close the scanner
//     }
// }



import java.util.Scanner;

public class p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(); // Read the number of rows

        // This outer loop runs once for each row
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
        
        sc.close(); // Closes the scanner to prevent resource leaks
    }
}