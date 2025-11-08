// Last updated: 11/8/2025, 2:03:24 PM
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int [nums.length];
        int[] rightSum = new int [nums.length];
        int[] result = new int [nums.length];
        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;
        for(int i = 0; i<nums.length; i++){
            if(i!=0){
                for(int j = i-1; j>=0; j--){
                    leftSum[i] += nums[j];
                }
            }
            if(i!=nums.length-1){
                for(int k = i+1; k<nums.length; k++){
                    rightSum[i] += nums[k];
                }
            }
        }
        
        for(int l = 0; l<nums.length; l++){
            result[l] = Math.abs(leftSum[l] - rightSum[l]);
        }
        return result;
    }
}