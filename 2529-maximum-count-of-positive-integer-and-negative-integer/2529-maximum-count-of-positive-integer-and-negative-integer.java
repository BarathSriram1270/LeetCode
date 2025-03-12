class Solution {
    public int maximumCount(int[] nums) {
        int tot=nums.length;
        int i=0,neg=0;
        while(nums[i]<=0 && i<tot){
            if(nums[i]<0)neg++;
            i++;
        }
        int pos=tot-i;
        return Math.max(pos,neg);
    }
}