class Solution {
    public int leastInterval(char[] tasks, int n) {
        int f[]=new int[26];
        for(Character i : tasks) f[i-'A']++;
        int max=0;
        for(int i : f) if(i>max) max=i;
        int fa=0;
        for(int i : f) if(i==max) fa++;
        return Math.max(tasks.length, ((max - 1) * (n + 1) + fa)); 
    }
}