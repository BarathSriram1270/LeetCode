class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        int st;
        if(nums.length%2==0)
        st=(nums.length/2) -1;
        else
        st=(nums.length/2);
        int len=nums.length-1;
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[ind]=nums[st];
                ind++;
                st--;
            }
            else{
                arr[ind]=nums[len];
                len--;
                ind++;
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
    }
}