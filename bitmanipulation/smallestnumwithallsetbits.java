// Example 1:

// Input: n = 5

// Output: 7

// Explanation:

// The binary representation of 7 is "111".

// Example 2:

// Input: n = 10

// Output: 15

// Explanation:

// The binary representation of 15 is "1111".

// Example 3:

// Input: n = 3

// Output: 3

// Explanation:

// The binary representation of 3 is "11".

class Solution {
    public int smallestNumber(int n) {
       int x = 1;  // first number with all bits set is 1 (binary "1")
        
        while (x < n) {
            x = (x << 1) | 1;  
        }
        
        return x; 
        
    }
}