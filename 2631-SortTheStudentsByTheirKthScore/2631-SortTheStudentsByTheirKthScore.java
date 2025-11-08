// Last updated: 11/8/2025, 2:03:25 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[k] > o2[k]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return score;        
    }
}