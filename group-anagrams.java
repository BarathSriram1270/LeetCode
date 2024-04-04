
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store sorted strings and their corresponding anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a char array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            // Check if the sorted string is already in the map
            if (!map.containsKey(sortedStr)) {
                // If not, add it to the map with an empty list
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the list of anagrams for the sorted string
            map.get(sortedStr).add(str);
        }
        
        // Create a list to store the grouped anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>();
        // Add all values (lists of anagrams) from the map to the result list
        groupedAnagrams.addAll(map.values());
        
        return groupedAnagrams;
    }
}
