import java.util.HashMap;
import java.util.Map;

class Solution {
    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        long result = 0;

        // Set of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Map<Character, Integer> vowelMap = new HashMap<>();
        for (char ch : vowels) {
            vowelMap.put(ch, 0);
        }

        // Sliding window pointers
        int left = 0;
        int consonantCount = 0;
        int uniqueVowels = 0;

        for (int right = 0; right < n; right++) {
            char ch = word.charAt(right);

            if (vowelMap.containsKey(ch)) {
                // Increment the count of the current vowel
                vowelMap.put(ch, vowelMap.get(ch) + 1);
                if (vowelMap.get(ch) == 1) {
                    uniqueVowels++; // New unique vowel added
                }
            } else {
                consonantCount++; // Increment consonant count
            }

            // Shrink the window from the left if necessary
            while (consonantCount > k || uniqueVowels == 5) {
                char leftChar = word.charAt(left);

                if (vowelMap.containsKey(leftChar)) {
                    // Decrement the count of the vowel being removed
                    vowelMap.put(leftChar, vowelMap.get(leftChar) - 1);
                    if (vowelMap.get(leftChar) == 0) {
                        uniqueVowels--; // Unique vowel removed
                    }
                } else {
                    consonantCount--; // Decrement consonant count
                }

                left++; // Move the left pointer
            }

            // If the window has all five vowels and exactly k consonants, increment the result
            if (uniqueVowels == 5 && consonantCount == k) {
                result++;
            }
        }

        return result;
    }
}