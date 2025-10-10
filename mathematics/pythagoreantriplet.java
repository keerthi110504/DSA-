class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n = arr.length;
        
        // Step 1: Square all elements
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
        // Step 2: Sort the squared array
        Arrays.sort(arr);
         
        // Step 3: Fix one element (as c²) and use two-pointer technique
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    return true; // found triplet
                }
                if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // No triplet found
        return false;

        
        
        
    }
}