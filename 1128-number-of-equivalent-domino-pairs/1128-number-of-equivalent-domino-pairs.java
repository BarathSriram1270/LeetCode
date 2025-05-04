class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int count = 0;
        
        // Normalize each domino by sorting the two elements
        for (int i = 0; i < n; i++) {
            if (dominoes[i][0] > dominoes[i][1]) {
                int temp = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = temp;
            }
        }
        
        // Compare each pair of dominoes using nested loop
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
