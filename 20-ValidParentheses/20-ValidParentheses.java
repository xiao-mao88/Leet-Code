// Last updated: 11/8/2025, 2:03:38 PM
class Solution {
    public boolean isValid(String s) {
            ArrayList<Character> openBrackets = new ArrayList<>();
    int numOpenBrackets = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        openBrackets.add(s.charAt(i));
        numOpenBrackets++;
      }

      switch (s.charAt(i)) {
        case ')':
          if (numOpenBrackets == 0 || !openBrackets.get(numOpenBrackets - 1).equals('(')) {
            return false;
          }
          numOpenBrackets--;
          openBrackets.remove(numOpenBrackets);
        break;
        case '}':
          if (numOpenBrackets == 0 || !openBrackets.get(numOpenBrackets - 1).equals('{')) {
            return false;
          }
          numOpenBrackets--;
          openBrackets.remove(numOpenBrackets);
        break;
        case ']':
          if (numOpenBrackets == 0 || !openBrackets.get(numOpenBrackets - 1).equals('[')) {
            return false;
          }
          numOpenBrackets--;
          openBrackets.remove(numOpenBrackets);
        break;
      }
    }

    return openBrackets.isEmpty();
    }
}