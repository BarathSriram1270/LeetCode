import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Step 1: Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] out = new int[intervals.length][2]; // Fixed-size array
        int m = 0; // Tracks the position in the output array
        
        // Store the first interval
        out[m] = intervals[0];

        // Step 2: Iterate through intervals and merge
        for (int i = 1; i < intervals.length; i++) {
            if (out[m][1] >= intervals[i][0]) {
                // Merge overlapping intervals
                out[m][1] = Math.max(out[m][1], intervals[i][1]);
            } else {
                // Move to the next position and store the new interval
                m++;
                out[m] = intervals[i];
            }
        }

        // Step 3: Return only the merged part of the array
        return Arrays.copyOf(out, m + 1);
    }
}
