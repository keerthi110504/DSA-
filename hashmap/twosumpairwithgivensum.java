// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true
// Explanation: arr[3] + arr[4] = -3 + 1 = -2
// Input: arr[] = [1, -2, 1, 0, 5], target = 0
// Output: false
// Explanation: None of the pair makes a sum of 0
// Input: arr[] = [11], target = 11
// Output: false
// Explanation: No pair is possible as only one element is present in arr[]

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        // Step 1: Create a HashSet to store visited numbers
        HashSet<Integer> set = new HashSet<>();

        // Step 2: Traverse the array
        for (int num : arr) {
            int complement = target - num; // number needed to reach target

            // Step 3: Check if complement is already seen
            if (set.contains(complement)) {
                return true; // pair found
            }

            // Step 4: Add current number to set
            set.add(num);
        }

        // Step 5: No pair found
        return false;
        
    }
}