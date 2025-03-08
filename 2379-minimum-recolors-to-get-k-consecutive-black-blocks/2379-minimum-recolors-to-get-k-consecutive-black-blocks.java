class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w = 0, min = Integer.MAX_VALUE;
        
        for (int i = 0; i <= blocks.length() - k; i++) {
            w = 0;
            for (int j = i; j < k + i; j++) {
                if (blocks.charAt(j) == 'W') {
                    w++;
                }
            }
            if (min > w) {
                min = w;
            }
        }
        
        return min;
    }
}
