// Last updated: 11/8/2025, 2:03:46 PM
class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);

        for(int i=0; i<num.length()/2; i++){
            String f = num.substring(i, i+1);
            String l = num.substring(num.length()-i-1, num.length()-i);
            if (!f.equals(l)){
                return false;
            }
        }

        return true;
    }
}