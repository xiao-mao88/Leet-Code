// Last updated: 11/8/2025, 2:03:23 PM
class Solution {
    public boolean makeStringsEqual(String s, String target) {
        if(s.equals(target)){
            return true;
        }
        else if(s.indexOf("1") != -1 && target.indexOf("1") != -1){
            return true;
        }
        return false;
    }
}