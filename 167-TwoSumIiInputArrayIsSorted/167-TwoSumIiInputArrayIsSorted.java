// Last updated: 11/8/2025, 2:03:32 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];
        int i = 0;
        int j = numbers.length-1;
        boolean found = false;

        while(!found){
            if(numbers[j] + numbers[i] > target){
                j--;
            }
            else if(numbers[j] + numbers[i] < target){
                i++;
            }
            else{
                found = true;
            }
        }

        r[0] = i+1;
        r[1] = j+1;
        
        return r;
    }
}