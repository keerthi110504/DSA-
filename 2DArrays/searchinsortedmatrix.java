// nput: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
// Output: true
// Explanation: 14 is present in the matrix, so output is true.
// Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
// Output: false
// Explanation: 42 is not present in the matrix.
// Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
// Output: true
// Explanation: 101 is present in the matrix.

class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0;
        int high = n * m - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}
