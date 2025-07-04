class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int max=sum;
        int j=0;
        while(j+k<nums.length){
            sum=sum+nums[j+k]-nums[j];
            max=Math.max(max,sum);
            j++;
        }
        return (double)max/k;
    }
}