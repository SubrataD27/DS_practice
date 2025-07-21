// import java.util.Scanner;
// public class p4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int start = 1;
//         for(int i = 0 ; i <n  ; i++)
//         {
            
//             if(i%2 == 0){
//                 start = 1;
//             }
//             else{
//                 start = 0;
//             }
//             for (int j = 0; j <=i ; j++) {
//                 System.out.print("start");
//                 start = 1-start;
//             }
//             // for (int j = 0; j < 2*i+1; j++) {
//             //     System.out.print("*");
//             // }
//             // for (int j = 0; j < n - i - 1; j++) {
//             //     System.out.print(" ");
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int start; // It's better to declare 'start' inside the loop

            // Determine the starting digit for the row
            if (i % 2 == 0) { // Even rows (0, 2, 4...) start with 1
                start = 1;
            } else { // Odd rows (1, 3, 5...) start with 0
                start = 0;
            }

            // Inner loop to print the digits for the current row
            for (int j = 0; j <= i; j++) {
                // This was the error: print the variable, not the string "start"
                System.out.print(start); 
                
                // Flip the digit for the next position in the row
                start = 1 - start; 
            }
            
            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}