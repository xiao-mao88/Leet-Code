// Last updated: 11/8/2025, 2:03:47 PM
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0) {

            int digit = x % 10;
            long test = (long)rev * 10 + digit;
            if (test > Integer.MAX_VALUE|| test < Integer.MIN_VALUE){
                return 0;
            }

            rev = rev * 10 + digit;

            x /= 10;
        }
        return rev;
    }
}