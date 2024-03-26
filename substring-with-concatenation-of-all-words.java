class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalWordsLength = wordLength * words.length;

        Map<String, Integer> wordFreqMap = new HashMap<>();
        for (String word : words) {
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalWordsLength; i++) {
            String substr = s.substring(i, i + totalWordsLength);
            if (isConcatenation(substr, wordFreqMap, wordLength)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isConcatenation(String substr, Map<String, Integer> wordFreqMap, int wordLength) {
        Map<String, Integer> tempMap = new HashMap<>(wordFreqMap);
        for (int i = 0; i < substr.length(); i += wordLength) {
            String word = substr.substring(i, i + wordLength);
            if (!tempMap.containsKey(word) || tempMap.get(word) == 0) {
                return false;
            }
            tempMap.put(word, tempMap.get(word) - 1);
        }
        return true;
    }
}
