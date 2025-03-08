import java.util.*;

class Solution {
    static int min;

    // Function to generate all subset sums
    public static void generateSubsetSums(int[] nums, int start, int end, int sum, List<Integer> list) {
        if (start == end) {
            list.add(sum);
            return;
        }
        // Include current element
        generateSubsetSums(nums, start + 1, end, sum + nums[start], list);
        // Exclude current element
        generateSubsetSums(nums, start + 1, end, sum, list);
    }

    public int minAbsDifference(int[] nums, int goal) {
        int n = nums.length;
        min = Integer.MAX_VALUE;

        // Split nums into two halves
        List<Integer> leftSums = new ArrayList<>();
        List<Integer> rightSums = new ArrayList<>();

        // Generate all subset sums for both halves
        generateSubsetSums(nums, 0, n / 2, 0, leftSums);
        generateSubsetSums(nums, n / 2, n, 0, rightSums);

        // Sort rightSums for efficient binary search
        TreeSet<Integer> rightSet = new TreeSet<>(rightSums);

        // Find the closest sum
        for (int sum : leftSums) {
            int target = goal - sum;

            // Find the closest sum in rightSet using floor and ceiling
            if (rightSet.floor(target) != null)
                min = Math.min(min, Math.abs(goal - (sum + rightSet.floor(target))));
            if (rightSet.ceiling(target) != null)
                min = Math.min(min, Math.abs(goal - (sum + rightSet.ceiling(target))));
        }

        return min;
    }
}
