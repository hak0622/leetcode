import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String>list = new ArrayList<>();
        HashMap<Character, Integer>map = new HashMap<>();

        for(int i=0; i<words[0].length(); i++){
            char c = words[0].charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=1; i<words.length; i++){
            HashMap<Character,Integer> cur = new HashMap<>();

            for(int j=0; j<words[i].length(); j++){
                char c = words[i].charAt(j);
                cur.put(c, cur.getOrDefault(c,0)+1);
            }

            for(char c : map.keySet()){
                int count = Math.min(map.get(c), cur.getOrDefault(c,0));
                map.put(c, count);
            }
        }

        for(char c : map.keySet()){
            int count = map.get(c);

            for(int i=0; i<count; i++){
                list.add(String.valueOf(c));
            }
        }
        
        return list;
    }
}