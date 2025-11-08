// Last updated: 11/8/2025, 2:03:23 PM
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int index = 0;
        int count = 0;
        Arrays.sort(divisors);
        
        for(int i=0; i<divisors.length; i++){
            int count2 = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]%divisors[i]==0){
                    count2++;
                }
            }
            if(count2>count){
                count = count2;
                index = i;
            }
        }
        return divisors[index];       
    }
}