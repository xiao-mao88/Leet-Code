// Last updated: 11/8/2025, 2:03:29 PM
class Solution {
    public String reverseWords(String s) {
                String theString = "";
        String add = "";
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            String newString = "";
            if(s.charAt(i) == ' '){
                for(int j = 0; j<i; j++){
                    if(!s.substring(i-j-1, i-j).equals(" ")){
                        newString += s.substring(i-j-1, i-j);
                    }
                    else{
                        j = i+1;
                    }
                }
                theString += newString + " ";
            }
        }
        int k=0;
        while(s.charAt(s.length() - k - 1) != ' '&& k<s.length()-1){
            add += s.substring(s.length()-k-1, s.length()-k);
            if(k==s.length()-2){
                add += s.substring(s.length()-k-2, s.length()-k-1);
            }
            k++;
        }
        s = theString + add;
        return s;
    }
}