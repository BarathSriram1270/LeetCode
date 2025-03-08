class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0,right=0,size=nums.length-1,count=0,sum=0;
        Map<Integer,Integer>fm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(fm.containsKey(nums[i])){
                if(fm.get(nums[i])<k){
                    sum+=nums[i];
                    count++;
                    fm.put(nums[i],fm.getOrDefault(nums[i],0)+1);
                }
                else{
                       while (fm.get(nums[i]) >= k) {
                        fm.put(nums[left], fm.get(nums[left]) - 1);
                        sum -= nums[left];
                        left++;
                        count--;
                    }
                    sum += nums[i];
                    count++;
                    fm.put(nums[i], fm.get(nums[i]) + 1);
                }
            }
            else{
                sum+=nums[i];
                count++;
                fm.put(nums[i],fm.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}