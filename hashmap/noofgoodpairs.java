// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Example 2:

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
class Solution {
    public int numIdenticalPairs(int[] nums) {
         HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (freq.containsKey(num)) {
                count += freq.get(num); // add existing occurrences as new pairs
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}