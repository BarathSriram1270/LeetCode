class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>low =new ArrayList<>();
        ArrayList<Integer>high=new ArrayList<>();
        ArrayList<Integer>piv=new ArrayList<>();
        ArrayList<Integer>tot=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                piv.add(nums[i]);
            }
            else if(nums[i]<pivot){
                low.add(nums[i]);
            }
            else{
                high.add(nums[i]);
            }
        }
        tot.addAll(low);
        tot.addAll(piv);
        tot.addAll(high);
        return tot.stream().mapToInt(Integer::intValue).toArray();
    }
}