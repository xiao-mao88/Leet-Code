// Last updated: 12/3/2025, 4:53:44 PM
class Solution {
    public int minMoves(int target, int maxDoubles) {
        int minMoves = 0;
        int timesDoubled = 0;
        while (target > 1) {
            if (timesDoubled < maxDoubles && target % 2 == 0) {
                target = target / 2;
                minMoves++;
                timesDoubled++;
            }
            else if (timesDoubled < maxDoubles) {
                target--;
                minMoves++;
            }
            else {
                minMoves += target - 1;
                target = 0;
            }
        }

        return minMoves;
    }
}