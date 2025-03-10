class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int n = s.length(), m = t.length();
        
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                j++; // Move to next character in t
            }
            i++; // Always move in s
        }
        
        return m - j; // Remaining characters in t need to be appended
    }
}
