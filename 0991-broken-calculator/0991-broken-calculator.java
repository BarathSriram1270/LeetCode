class Solution {
    public int brokenCalc(int st, int t) {
        int o=0;
        while(t>st){
            if(t%2==0) {
                t/=2;
            }
            else{
                t++;
            }
            o++;
        }
        return o+(st-t);
    }
}