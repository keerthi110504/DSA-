class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        // Temporary arrays of size n (worst-case all positives or all negatives)
        int[] pos = new int[n];
        int[] neg = new int[n];

        int p = 0; // count / write index for pos[]
        int q = 0; // count / write index for neg[]

        // Single pass: separate positives (>= 0) and negatives (< 0)
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[p++] = arr[i];
            } else {
                neg[q++] = arr[i];
            }
        }

        // Copy positives back to arr, preserving order
        int idx = 0;
        for (int i = 0; i < p; i++) {
            arr[idx++] = pos[i];
        }

        // Then copy negatives, preserving order
        for (int i = 0; i < q; i++) {
            arr[idx++] = neg[i];
        }
    }

    // Optional main for quick testing:
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1, -1, 3, 2, -7, -5, 11, 6};
        s.segregateElements(arr1);
        System.out.println(java.util.Arrays.toString(arr1));
        // Expected: [1, 3, 2, 11, 6, -1, -7, -5]

        int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};
        s.segregateElements(arr2);
        System.out.println(java.util.Arrays.toString(arr2));
        // Expected: [7, 9, 10, 11, -5, -3, -4, -1]
    }
}
