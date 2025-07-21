import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i = 1 ; i <= (2 * n - 1) ; i++)
        {
            int stars = i;
            if(i>n){
                stars = (2 * n) - i;
            }
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            // for (int j = 0; j < 2*i+1; j++) {
            //     System.out.print("*");
            // }
            // for (int j = 0; j < n - i - 1; j++) {
            //     System.out.print(" ");
            System.out.println();
        }
    }
}