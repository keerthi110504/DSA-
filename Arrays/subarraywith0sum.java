class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: If sum is 0, whole subarray (0..i) has sum 0
            if (sum == 0) {
                maxLen = i + 1;
            }

            // Case 2: If sum already seen before
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                // Store first occurrence of this sum
                map.put(sum, i);
            }
        }

        return maxLen;
        
    }
}