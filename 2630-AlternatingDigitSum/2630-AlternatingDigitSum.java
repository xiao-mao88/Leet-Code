// Last updated: 11/8/2025, 2:03:25 PM
class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int theSum = Character.getNumericValue(s.charAt(0));
        int i = 1;

        for(int j = 1; j<s.length(); j++){
            if(i%2 == 0){
                theSum += theSum = Character.getNumericValue(s.charAt(j));
            }
            else{
                theSum -= Character.getNumericValue(s.charAt(j));
            }
            i++;
        }
        return theSum;
    }
}