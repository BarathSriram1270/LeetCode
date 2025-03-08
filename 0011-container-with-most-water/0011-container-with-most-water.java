class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,size=height.length-1,curmin=Integer.MAX_VALUE;
        int curans=0,ans=0;
        while(left<=right){
            curmin=height[left]>height[right]?height[right]:height[left];
            curans=curmin*size;
            if(ans<curans){
                ans=curans;
            }
            if(height[left+1]>height[left] && height[left+1]>height[right-1]){
                left++;
                size--;
            }
            else if(height[right-1]>height[right] && height[right-1]>height[left+1]){
                right--;
                size--;
            }
            else{
                right--;
                left++;
                size=size-2;
            }

        }
        return ans;
    }
}