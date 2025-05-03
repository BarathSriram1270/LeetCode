class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        String vowelsSet = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowelsSet.indexOf(ch) != -1) {
                vowels.append(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        int vowelIndex = vowels.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowelsSet.indexOf(ch) != -1) {
                result.append(vowels.charAt(vowelIndex--));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
