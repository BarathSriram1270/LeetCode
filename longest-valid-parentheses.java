class Solution {
    public int longestValidParentheses(String s) {
        // Stack to store indices of '('
        Stack<Integer> stack = new Stack<>();
        // Push -1 to stack to mark the base for the first valid substring
        stack.push(-1);
        int maxLength = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // If it's an opening parenthesis, push the index to the stack
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                // If it's a closing parenthesis, pop the top
                stack.pop();

                // If the stack is empty, push the current index as base
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    // Calculate the length of the valid substring
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}
