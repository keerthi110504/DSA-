class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double cur = x;          // current base x^(2^i)
        while (N > 0) {
            if ((N & 1) == 1)    // if lowest bit is 1, multiply result by current base
                result *= cur;
            cur *= cur;          // square the base for next bit
            N >>= 1;             // shift exponent right by 1 bit
        }
        return result;
    }
}
