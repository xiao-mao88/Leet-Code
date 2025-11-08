// Last updated: 11/8/2025, 2:03:31 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int high = n;
        int low = 1;

        while(low<=high){
            int start = low + (high-low)/ 2;
            if(isBadVersion(start) == false){
                low = start +1;
                if(isBadVersion(start+1) == true){
                    return start+1;
                }
            }
            else if(isBadVersion(start) == true){
                high = start - 1;
                if(isBadVersion(start-1) == false){
                    return start;
                }
            }
        }
        return -1;
    }
}