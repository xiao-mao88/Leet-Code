// Last updated: 11/8/2025, 2:03:52 PM
class Solution {
    //do this in less than O(n^2) time
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
       }
       for (int i = 0; i < nums.length; i++) {
        int comp = target - nums[i];
        if (map.containsKey(comp) && map.get(comp) != i) {
            return new int[] {i, map.get(comp)};
        }
       }
       return new int[] {};
    }
}