import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int idxG = 0;
        int idxS = 0;
        int count = 0;

        while(idxG < g.length && idxS < s.length){
            if(g[idxG] <= s[idxS]){
                idxG++;
                idxS++;
                count++;
            }else{
                idxS++;
            }
        }
        return count;
    }
}