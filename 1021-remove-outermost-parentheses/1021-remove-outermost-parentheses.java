class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(st.isEmpty()&& c=='('){
                st.push(c);
                continue;
            }
            else if(c=='('){
                st.push(c);
            }
            else{
                st.pop();
                if(st.isEmpty()) continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}