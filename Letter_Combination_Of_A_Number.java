class Solution {
    private static final String[] LETTERS = {
        "",    
        "",    
        "abc", 
        "def", 
        "ghi", 
        "jkl", 
        "mno", 
        "pqrs",
        "tuv", 
        "wxyz" 
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return combinations;

        generateCombinations(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }
    
    private void generateCombinations(String digits, int index, StringBuilder current, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = LETTERS[digit - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generateCombinations(digits, index + 1, current, combinations);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
