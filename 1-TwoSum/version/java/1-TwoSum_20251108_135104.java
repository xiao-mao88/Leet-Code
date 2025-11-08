// Last updated: 11/8/2025, 1:51:04 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int first = 0;
        int second = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    first = i;
                    second = j;
                    i = nums.length+1;
                    j = nums.length+1;
                }
            }
        }

        int[] arr = {first, second};
        return arr;
    }
}