class Solution {
    public long coloredCells(int n) {
       long x=1;
       long c=4;
       while(n>1){
        x+=c;
        c+=4;
        n--;
       }
       return x;
    }
}