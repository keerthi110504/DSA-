class Solution {
    public int reverseBits(int n) {
       int result = 0;
        
        for (int i = 0; i < 32; i++) {
            // Shift result left by 1 to make space
            result <<= 1;
            
            // Take the last bit of n and add it to result
            result |= (n & 1);
            
            // Unsigned right shift n
            n >>>= 1;
        }
        
        return result; 
    }
}