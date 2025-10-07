class Solution {
public:
    bool isPerfectSquare(int num) {
        long long left = 1, right = num;
        
        while (left <= right) {
            long long mid = left + (right - left) / 2;
            long long square = mid * mid;
            
            if (square == num) {
                return true;  // Found perfect square
            } else if (square < num) {
                left = mid + 1;  // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        
        return false; // No integer square found
    }
};
