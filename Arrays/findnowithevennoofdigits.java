// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.
// Example 2:

// Input: nums = [555,901,482,1771]
// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.

class Solution {
    public int findNumbers(int[] nums) {
     int count = 0;

        for (int num : nums) {
            int digits = 0;
            int n = num;

            // Count digits by dividing by 10
            while (n > 0) {
                n /= 10;
                digits++;
            }

            // Check if digits count is even
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;   
    }
}