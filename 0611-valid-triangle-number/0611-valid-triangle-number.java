class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;

        for (int i = nums.length - 1; i >= 2; i--) {
            int cur = nums[i];  // fixed side (largest side)
            int left = 0, right = i - 1;

            while (left < right) {
                if (nums[left] + nums[right] > cur) {
                    ret += right - left;  // all pairs from left to right-1 are valid
                    right--;
                } else {
                    left++;
                }
            }
        }

        return ret;
    }
}
