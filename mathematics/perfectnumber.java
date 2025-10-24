// Given a number n, check if the number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

// Examples:

// Input: n = 6
// Output: true 
// Explanation: Factors of 6 are 1, 2, 3 and 6. Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.
// Input: n = 10
// Output: false
// Explanation: Factors of 10 are 1, 2, 5 and 10. Excluding 10 their sum is 8 which is not equal to n itself. So, it's not a Perfect Number.

class Solution {
    static boolean isPerfect(int n) {
        // code here
        if (n == 1) return false;

        int sum = 1; // 1 is always a divisor (except for n=1)
        
        // loop till sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {  // avoid adding square root twice
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
};