#include <iostream>
using namespace std;

class Solution {
public:
    void printNumber() {
        int number;
        cout << "Enter a number: ";
        cin >> number;                  // Read input from user
        cout << "Output: " << number;   // Print the number
    }
};

int main() {
    Solution sol;           // Create object of Solution
    sol.printNumber();      // Call the method
    return 0;
}
