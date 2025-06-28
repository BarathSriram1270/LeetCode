class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<k){
            return false;
        }
        Map<Integer,Integer> fm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(fm.containsKey(x)){
                if(Math.abs(fm.get(x)-i)<=k) return true;
                else fm.put(x,i);
            }
            else{
                fm.put(x,i);
            }
        }
        return false;
    }
}