// Last updated: 11/8/2025, 2:03:45 PM
class Solution {
    public boolean isMatch(String s, String p) {
                if (p == null || p.length() == 0) return (s == null || s.length() == 0);

        boolean[][] arr = new boolean[s.length()+1][p.length()+1];
        arr[0][0] = true;

        for(int i=2; i<p.length() + 1; i++){
            arr[0][i] = p.charAt(i-1) == '*' && arr[0][i-2];
        }

        for(int j=1; j<p.length()+1; j++){
            for(int k=1; k<s.length()+1; k++){
                if(p.charAt(j-1) == s.charAt(k-1) || p.charAt(j-1) == '.') {
                    arr[k][j] = arr[k-1][j-1];
                }

                else if(p.charAt(j-1) == '*'){
                    arr[k][j] = arr[k][j-2]
                            || ((s.charAt(k-1) == p.charAt(j-2)
                            || p.charAt(j-2) == '.') && arr[k-1][j]);
                }
            }
        }

        return arr[s.length()][p.length()];
    }
}