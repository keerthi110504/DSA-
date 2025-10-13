// Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
// Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
// Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
// import java.util.Arrays;
// it can be also done using gap method 

class Solution {
    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;
        int k = n - 1;  // points to last element in a

        // Step 1: Compare and swap elements where needed
        while (i <= k && j < m) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                // swap a[k] with b[j]
                int temp = a[k];
                a[k] = b[j];
                b[j] = temp;
                k--;
                j++;
            }
        }

        // Step 2: Sort both arrays individually
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
