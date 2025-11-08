// Last updated: 11/8/2025, 2:03:40 PM
class Solution {
      private static final String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();

    if (digits.isEmpty()) {
      return res;
    }

    backtrack(0, digits, new StringBuilder(), res);

    return res;
    }
      private void backtrack(int index, String digits, StringBuilder path, List<String> combinations) {
    if (index == digits.length()) {
      combinations.add(path.toString());
      return;
    }

    String possibleLetters = phone[digits.charAt(index) - '0'];
    for (char letter : possibleLetters.toCharArray()) {
      path.append(letter);
      backtrack(index + 1, digits, path, combinations);
      path.deleteCharAt(path.length() - 1); // Backtrack
    }
  }
}