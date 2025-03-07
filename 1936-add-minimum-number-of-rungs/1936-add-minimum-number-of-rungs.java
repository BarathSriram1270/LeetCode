class Solution {
    public int addRungs(int[] rungs, int dist) {
        int x=0;
        int c=0;
        for(int i=0;i<rungs.length;i++){
            if((rungs[i]-x)<=dist){
                x=rungs[i];
            }
            else{
                c+=(rungs[i]-x-1)/dist;
                x=rungs[i];
            }
        }
        return c;
    }
}