class Solution {
    public int climbStairs(int n){
        if (n <= 1) {
            return 1;
        }

        // Initialize the base cases
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        // Fill the dp array using the relation dp[i] = dp[i-1] + dp[i-2]
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Return the final result
        return dp[n];
    }
}
