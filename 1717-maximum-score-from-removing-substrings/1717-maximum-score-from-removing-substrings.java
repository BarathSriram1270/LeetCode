class Solution {
    public static int find(String s,char f,char se,int sum,StringBuilder sb){
        Stack<Character>arr=new Stack<>();
        int t=0;
        for(char c:s.toCharArray()){
            if(!arr.isEmpty()&& arr.peek()==f && c==se){
                t+=sum;
                arr.pop();
            }
            else{
                arr.push(c);
            }
        }
        sb.setLength(0);
        while(!arr.isEmpty()){
            sb.append(arr.pop());
        }
        sb.reverse();
        return t;
    }
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb=new StringBuilder();
        int score=0;
        if(x>y){
            score= find(s,'a','b',x,sb);
            score+=find(sb.toString(),'b','a',y,sb);
        }
        else{
            score = find(s,'b','a',y,sb);
            score+=find(sb.toString(),'a','b',x,sb);
        }
        return score;
    }

}