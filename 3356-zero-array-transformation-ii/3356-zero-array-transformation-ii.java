class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        if(Arrays.equals(nums,new int[nums.length])) return 0;
        int n = nums.length;
        int[] diff = new int[n + 1]; // Difference array of size n+1

        for (int k = 0; k < queries.length; k++) {
            int l = queries[k][0], r = queries[k][1], val = queries[k][2];

            // Apply difference array technique
            diff[l] -= val;
            if (r + 1 < n) {
                diff[r + 1] += val;
            }

            // Apply prefix sum to update nums[]
            int[] tempNums = new int[n];
            int runningSum = 0;
            for (int i = 0; i < n; i++) {
                runningSum += diff[i];
                tempNums[i] = Math.max(0, nums[i] + runningSum);
            }

            // Check if nums is a zero array
            if (isZeroArray(tempNums)) {
                return k + 1; // Since queries are 1-based
            }

            // Copy tempNums back to nums for the next iteration
            nums = tempNums;
        }

        return -1; // If nums never becomes a zero array
    }

    // Helper function to check if nums is a zero array
    private boolean isZeroArray(int[] nums) {
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}
