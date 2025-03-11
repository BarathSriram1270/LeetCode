class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character>arr=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                arr.push(s.charAt(i));
            }
            else{
                if(!arr.isEmpty()){
                if(')'==s.charAt(i) && arr.peek()=='(' || ']'==s.charAt(i) && arr.peek()=='[' || '}'==s.charAt(i) && arr.peek()=='{') arr.pop();
                else return false;}
                else return false;
            }
        }
        if(arr.isEmpty())
        return true;
        return false;
    }
}