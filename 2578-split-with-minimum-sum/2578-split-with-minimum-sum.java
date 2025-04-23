class Solution {
    public int splitNum(int num) {
        String s= String.valueOf(num);
        char[] ch= s.toCharArray();
        Arrays.sort(ch);
        String srt=new String(ch);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int i=0;
        for(char c : srt.toCharArray()){
            if(i==0){
                sb.append(c);
                i=1;
            }
            else{
                sb1.append(c);
                i=0;
            }
        }
        return Integer.parseInt(sb.toString())+ Integer.parseInt(sb1.toString());
    }
}