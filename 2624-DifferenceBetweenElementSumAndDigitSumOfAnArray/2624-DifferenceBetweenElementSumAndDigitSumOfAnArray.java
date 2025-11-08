// Last updated: 11/8/2025, 2:03:26 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum = 0; int elementSum = 0;
        for(int i = 0; i<nums.length; i++){
            elementSum += nums[i];
            String number = String.valueOf(nums[i]);
            for(int k = 0; k < number.length(); k++) {
                int j = Character.digit(number.charAt(k), 10);
                digitSum += j;
            }
        }
        int diff = Math.abs(elementSum - digitSum);
        return diff;
    }
}