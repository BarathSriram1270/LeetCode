class Compute {
    public String isSubset( long a1[], long a2[], long n, long m){
        HashMap<Long, Integer> map = new HashMap<>();

        // Store the frequency of each element in a1
        for (long num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if all elements of a2 can be found in a1 with the required frequency
        for (long num : a2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return "No"; // Element not found or insufficient frequency
            } else {
                map.put(num, map.get(num) - 1); // Decrease the frequency
            }
        }
        return "Yes"; // All elements of a2 are present in a1 with the required frequency
    }
}
