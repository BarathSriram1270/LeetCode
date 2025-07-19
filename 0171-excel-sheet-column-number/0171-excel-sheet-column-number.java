class Solution {
    public int titleToNumber(String in) {
        int sum=0;
        for(char c:in.toCharArray()){
            int val=(int)c-64;
            sum=sum*26+val;
        }
        return sum;
    }
}