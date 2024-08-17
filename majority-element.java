class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : nums) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        int maxFrequency = 0;
        int maxElement = -1;
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = key;
            }
        }
        return maxElement;
    }
}
