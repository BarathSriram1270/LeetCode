class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int res[]=new int[nums.length];
        Arrays.fill(res,-1);
        System.out.println(Arrays.toString(res));
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()] <nums[i]){
                int ind=stack.pop();
                res[ind]=nums[i];
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(res));
        for(int i=0;i<res.length;i++){
            if(res[i]==-1){
                for(int j=0;j<i;j++){
                    if(nums[i] <nums[j]){
                        res[i]=nums[j];
                        break;
                    }
                }
            }
        }
        return res;
    }
}