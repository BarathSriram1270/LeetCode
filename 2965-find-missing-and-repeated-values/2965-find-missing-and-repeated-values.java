class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] ar = new int[n*n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[grid[i][j]-1]++;
            }
        }
        int[] res = new int[2];

        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                res[1]=i+1;
            }
            else if(ar[i]==2){
                res[0]=i+1;
            }
        }
        return res;

    }
}