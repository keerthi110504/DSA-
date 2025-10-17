// nums1 = [1,2,3], nums2 = [2,4]
// Output: 2
// Explanation: The smallest element common to both arrays is 2, so we return 2.

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i]; // smallest common element found
            } else if (nums1[i] < nums2[j]) {
                i++; // move pointer in nums1
            } else {
                j++; // move pointer in nums2
            }
        }
        
        return -1; // no common element found
    }
}
