// import java.util.Scanner;
// public class p6 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         for(int i = 1 ; i < = n ; i++ ){

//             for (int j = 1; j <=i; j++) {
//                 System.out.print(j);
//             }
//             // for (int j = 1; j <=(2*(n-1)); j++) {
//             //     System.out.print(" ");
//             // }
//             for (int j = 1; j <=(2*(n-1)); j++) {
//             System.out.print(" ");
//             }

//             for (int j = i; j>=1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // 1. Print the increasing numbers (1, 12, 123, ...)
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j);
            }

            
            for (int j = 1 ; j <= 2 * (n - i) ; j++) {
                System.out.print(" ");
            }

            
            for (int j = i ; j >= 1 ; j--) {
                System.out.print(j);
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}