class Solution {
    public long dividePlayers(int[] skill) {
        int l=0,r=skill.length-1;
        long tem,tsum=0,sum=0;
        Arrays.sort(skill);
        tem=skill[0]+skill[skill.length-1];
        while(l<=r){
            if(skill[l]+skill[r]!=tem){
                return -1;
            }
            tsum=skill[l]*skill[r];
            sum+=tsum;
            l++;
            r--;
        }
        return sum;
    }
}