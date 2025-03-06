class Solution {
    public int leastInterval(char[] tasks, int n) {
        int f[] = new int[26];
        int t = tasks.length;
        for(int i=0; i<t; i++) f[tasks[i] - 'A']++;
        int mx = 0;
        for(int i=0; i<26; i++) mx = Math.max(mx, f[i]);
        int fa = 0;
        for(int i=0; i<26; i++) if(f[i]==mx) fa++;
        
        return Math.max(t, ((mx-1)*(n+1) + fa));
    }
}