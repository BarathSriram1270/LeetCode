class Solution {
    public void nextPermutation(int[] nums) {
        // Find the first decreasing element from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If there is a decreasing element
        if (i >= 0) {
            // Find the first element larger than the decreasing element
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            // Swap the decreasing element with the larger element
            swap(nums, i, j);
        }

        // Reverse the elements after the decreasing element
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
