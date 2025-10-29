// Input: arr[] = [2, 3, 2, 3, 5]
// Output: [0, 2, 2, 0, 1]
// Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
// Input: arr[] = [3, 3, 3, 3]
// Output: [0, 0, 4, 0]
// Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
// Input: arr[] = [1]
// Output: [1]
// Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.


class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        
        // Step 1: Create a HashMap to store frequencies
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // Step 2: Count occurrences of each number
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        // Step 3: Prepare result list
        ArrayList<Integer> result = new ArrayList<>(n);
        
        // Step 4: Fill frequencies for numbers 1 to n
        for (int i = 1; i <= n; i++) {
            result.add(hm.getOrDefault(i, 0));
        }
        
        // Step 5: Return result
        return result;
        
        
    }
}

