class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Integer[] temp=new Integer[i+1];
            Arrays.fill(temp,1);
            ans.add(Arrays.asList(temp));
        }
        for(int i=0;i<n;i++){
            if(ans.get(i).size()==1 || ans.get(i).size()==2){
                continue;
            }
            int x=0,y=1;
            for(int j=1;j<ans.get(i).size()-1;j++){
                ans.get(i).set(j, ans.get(i - 1).get(x) + ans.get(i - 1).get(y));
                x++;
                y++;
            }
        }
        return ans;
    }
}