// Last updated: 11/8/2025, 2:03:41 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
    int closest = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int tempSum = nums[i] + nums[j] + nums[k];
        if (tempSum == target) {
          return target;
        }

        if (Math.abs(target - tempSum) < Math.abs(closest - target)) {
          closest = tempSum;
        }

        else if (tempSum < target) {
          j++;
        }

        else {
          k--;
        }
      }
    }
    return closest;
    }
}