class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        Set<Character> seen = new HashSet<>();
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            while (seen.contains(s.charAt(end))) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
