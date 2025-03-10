class Solution {
    public int brokenCalc(int st, int t) {
        if (st==t) return 0;
        if (st>t) return st-t;
        int c=0;
        while(st<t){
            if(st*2==t){
                st=st*2;
                c++;
            }
            else if((st-1)*2==t){
                st--;
                st=st*2;
                c+=2;
            }
            else if((st*2)-1 == t){
                st*=2;
                st--;
                c+=2;
            }
            else if(st*2 < t){
                st*=2;
                c++;
            }
            else{
                st--;
                c++;
            }
        }
        return c;
    }
}