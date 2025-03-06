
class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Step 1: Count frequency of tasks
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        
        // Step 2: Use a max heap (PriorityQueue in Java) to always process the most frequent task first
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int count : freq) {
            if (count > 0) {
                maxHeap.add(count);
            }
        }
        
        int cycles = 0;
        
        // Step 3: Process tasks in rounds
        while (!maxHeap.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            int time = 0;
            
            for (int i = 0; i <= n; i++) { // Process n+1 tasks per cycle
                if (!maxHeap.isEmpty()) {
                    tempList.add(maxHeap.poll() - 1); // Reduce task count by 1
                    time++;
                }
            }
            
            // Step 4: Reinsert remaining tasks into the heap
            for (int count : tempList) {
                if (count > 0) {
                    maxHeap.add(count);
                }
            }
            
            // If heap is empty, add only the required time, otherwise, add a full (n+1) cycle
            cycles += maxHeap.isEmpty() ? time : (n + 1);
        }
        
        return cycles;
    }
}