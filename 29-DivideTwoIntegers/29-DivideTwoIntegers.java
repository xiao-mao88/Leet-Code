// Last updated: 11/25/2025, 12:42:14 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if (Integer.MIN_VALUE == dividend && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int quotient = 0;
        int divider = Math.abs(divisor);
        int divided = Math.abs(dividend);
        while (divided - divider >= 0) {
            int temp = divider;
            int count = 1;
            while (divided - (temp << 1) >= 0) {
                temp <<= 1;
                count <<= 1;
            }
            divided -= temp;
            quotient += count;
        }

        return (dividend > 0) == (divisor > 0) ? quotient : - quotient;
    }
}