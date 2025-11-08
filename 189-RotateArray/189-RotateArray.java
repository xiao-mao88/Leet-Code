// Last updated: 11/8/2025, 2:03:31 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int [] result = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
            int index = (i+k)%nums.length;
            result[index] = nums[i];
        }

        for(int j = 0; j<nums.length; j++){
            nums[j] = result[j];
        }

        System.out.println(Arrays.toString(nums));
    }
}