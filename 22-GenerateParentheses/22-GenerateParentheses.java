// Last updated: 11/10/2025, 9:58:31 AM
class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> result = new ArrayList<>();

     dfs(0, 0, "", n, result);  
      
     return result;
    }

    private void dfs(int openParen, int closeParen, String s, int n, List<String> result) {
        if (openParen + closeParen == n*2) {
            result.add(s);
            return;
        }

        if (openParen < n) {
            dfs(openParen + 1, closeParen, s+ "(", n, result);
        }

        if (closeParen < openParen) {
            dfs(openParen, closeParen + 1, s + ")", n, result);
        }
    }
}