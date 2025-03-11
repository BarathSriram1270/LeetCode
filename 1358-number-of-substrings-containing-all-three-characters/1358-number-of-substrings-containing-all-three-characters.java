class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                String t=s.substring(i,j);
                if(t.contains("a") && t.contains("b") && t.contains("c")){
                    c++;
                }
            }
        }
        return c;
    }
}