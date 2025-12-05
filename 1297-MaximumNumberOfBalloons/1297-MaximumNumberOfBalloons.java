// Last updated: 12/5/2025, 10:11:14 AM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'b') {
                b++;
            }
            else if (letter == 'a') {
                a++;
            }
            else if (letter == 'l') {
                l++;
            }
            else if (letter == 'o') {
                o++;
            }
            else if (letter == 'n') {
                n++;
            }
        }

        return Math.min(Math.min(Math.min(Math.min(b, a), (l / 2)), (o / 2)), n);
    }
}