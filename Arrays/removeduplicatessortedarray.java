class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        if (n == 0) return result;

        int i = 0; // slow pointer
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // move unique element forward
            }
        }

        // collect unique elements
        for (int k = 0; k <= i; k++) {
            result.add(arr[k]);
        }

        return result;
        
    }
}
