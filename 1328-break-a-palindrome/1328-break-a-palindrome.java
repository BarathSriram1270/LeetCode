class Solution {
    public String breakPalindrome(String pal) {
        if(pal.length()==1 || pal.length()==0){
            return "";
        }
        int f=0;
        for(char c : pal.toCharArray()){
            if(c!='a'){
                pal=pal.replaceFirst(String.valueOf(c),"a");
                f=1;
                break;
            }
        }
        if(f==1) return pal;
        int li=pal.lastIndexOf('a');
        System.out.println(li);
        if(li!=-1) pal=pal.substring(0,li)+"b"+pal.substring(li+1);
        return pal;
    }
}