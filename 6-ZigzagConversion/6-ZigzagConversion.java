// Last updated: 11/8/2025, 2:03:48 PM
class Solution {
    public String convert(String s, int numRows) {
                String newStr = "";
        ArrayList<ArrayList<String>> zig = new ArrayList<ArrayList<String>>();
        int col = 0;

        while(s.length()>0){
            ArrayList<String> zag = new ArrayList<String>();
            for(int i=0; i<numRows; i++){
                if(numRows==1 || col % (numRows - 1) == 0 && s.length()>0){
                    zag.add(s.substring(0,1));
                    if(s.length()>1) {
                        s = s.substring(1);
                    }
                    else{
                        s = "";
                    }
                }

                else if(col % (numRows - 1) == numRows - i - 1 && s.length()>0){
                    zag.add(s.substring(0,1));
                    if(s.length()>1) {
                        s = s.substring(1);
                    }
                    else{
                        s = "";
                    }
                }

                else {
                    zag.add("");
                }
            }
            col++;
            zig.add(zag);
        }

        for(int i=0; i<zig.get(0).size(); i++){
            for(int j=0; j<zig.size(); j++){
                newStr += zig.get(j).get(i);
            }
        }
        return newStr;
    }
}