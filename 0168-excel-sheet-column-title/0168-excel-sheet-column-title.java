class Solution {
    public String convertToTitle(int c) {
        StringBuilder sb= new StringBuilder();
        int f=0;
        while(c>0 && f<1){
            int x;
            if(c>25){
                x=c/26;
                while(x>26){
                    x=x/26;
                }
            }
            else{
                x=c;
            }
            char ch=(char)(x+64);
            sb.append(ch);
            if(c<26){
                f++;
            }
            c=c%26;
        }
        return sb.toString();
    }
}