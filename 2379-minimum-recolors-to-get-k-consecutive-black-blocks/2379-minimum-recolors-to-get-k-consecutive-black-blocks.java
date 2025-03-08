class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(k==1){
            if(blocks.contains("B")){
                return 0;
            }
            if(blocks.contains("W")){
                return 1;
            }
        }
        int w = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                w++;
            }
        }
        if(w<min) min=w;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W') w++;
            if(blocks.charAt(i-k)=='W') w--;
            if(w<min) min=w;
        }
        return min;
    }
}
