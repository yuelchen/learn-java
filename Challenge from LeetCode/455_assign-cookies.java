class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int happyChildren = 0;
        for(int i=0; i < s.length; i++) {
            if(happyChildren == g.length) {
                break;
            } else if(s[i] >= g[happyChildren]) {
                happyChildren++;
            }
        }
        
        return happyChildren;
    }
}
