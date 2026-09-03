import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c,0)-1);
        }

        for(char k : map.keySet()){
            if(map.get(k) < 0) return k;
        }
        return 'a';
    }
}