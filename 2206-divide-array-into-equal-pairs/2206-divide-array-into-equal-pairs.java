class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer>fm=new HashMap<>();
        for(int x:nums){
            fm.put(x,fm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : fm.entrySet()){
            if(entry.getValue()%2==1) return false;
        }
        return true;
    }
}