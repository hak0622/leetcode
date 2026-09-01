import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();

        for(int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);

            if(map1.containsKey(c)){
                map1.put(c, map1.getOrDefault(c,0)-1);
            }
        }

        for(int count : map1.values()){
            if(count >= 1) return false;
        }

        return true;
    }
}