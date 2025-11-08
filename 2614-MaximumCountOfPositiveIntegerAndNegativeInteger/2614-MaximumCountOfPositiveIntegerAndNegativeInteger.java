// Last updated: 11/8/2025, 2:03:27 PM
class Solution {
    public int maximumCount(int[] nums) {
        int neg=0, pos=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg++;
            }
            else if(nums[i]>0){
                pos++;
            }
        }
        if(neg>pos){
            return neg;
        }
        return pos;
    }
}