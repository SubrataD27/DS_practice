package practice;
import java.util.Scanner;

import Solution;

class Solution {
    public void printNumber(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();         // Read input from user
        System.out.println("Output: " + number);  // Print the number
    }
}

public class pb2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {   // Try-with-resources
            Solution sol = new Solution();            // Create Solution object
            sol.printNumber(sc);                      // Call the method
        }
    }
}
