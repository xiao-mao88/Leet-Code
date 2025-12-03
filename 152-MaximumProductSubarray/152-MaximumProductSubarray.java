// Last updated: 12/3/2025, 5:14:40 PM
class Solution {
    public int maxProduct(int[] nums) {
        // base case:
        if (nums.length == 1 ) {
            return nums[0];
        }

        int maxProduct = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentProduct = nums[i];
            for (int j = i; j < nums.length - 1; j++) {
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
                currentProduct = currentProduct * nums[j+1];
            }
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }

        return maxProduct;
    }
}