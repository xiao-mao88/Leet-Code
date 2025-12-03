class Solution {
    public int maxProduct(int[] nums) {
        // base case:
        if (nums.length == 1 ) {
            return nums[0];
        }

        int maxProduct = nums[0];
        int curr_min  = nums[0];
        int curr_max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int prevMax = curr_max;
            curr_max = Math.max(num, Math.max(num * curr_max, num * curr_min));
            curr_min = Math.min(num, Math.min(num * curr_min, num * prevMax));

            maxProduct = Math.max(curr_max, maxProduct);
        }

        return maxProduct;
    }
}
