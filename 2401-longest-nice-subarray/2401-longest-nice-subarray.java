class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=0,tmax=0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i] & nums[i+1])==0){
                tmax++;
            }
            else{
                tmax=0;
            }
            max=Math.max(tmax,max);
        }
        return max==0?1:max;
    }
}