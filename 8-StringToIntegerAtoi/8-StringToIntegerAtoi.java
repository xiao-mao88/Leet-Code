// Last updated: 11/8/2025, 2:03:46 PM
class Solution {
    public int myAtoi(String s) {
         s = s.trim(); // trim takes away any leading whitespace
        // returns 0 if the string is empty after trimming
        if (s.isEmpty()){
            return 0;
        }

        int num = 0, i = 0;
        boolean neg = s.charAt(0) == '-';
        boolean pos = s.charAt(0) == '+';

        if (neg || pos) {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            // checking if integer is in range
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return neg ? -num : num;
    }
}