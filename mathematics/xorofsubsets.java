// Given an array arr[], return the sum of the XOR of all elements for every possible subset of the array. Subsets with the same elements should be counted multiple times.

// An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

// Note: The answer is guaranteed to fit within a 32-bit integer.

// Examples:

// Input: arr[] = [7, 2]
// Output: 14
// Explanation: Subsets are: [[], [7], [2], [7, 2]]
// Sum of all XOR's = 7 + 2 + (7 ^ 2) = 14.

class Solution {
    public int subsetXORSum(int[] arr) {
        int orValue = 0;
        for (int num : arr) {
            orValue |= num; // bitwise OR of all elements
        }

        int n = arr.length;
        return orValue * (1 << (n - 1)); // multiply by 2^(n-1)
    }
}
