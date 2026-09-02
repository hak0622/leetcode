import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=97; i<=122; i++){
            map.put((char)i, 0);
        }

        for(int i=0; i<sentence.length(); i++){
            char c = sentence.charAt(i);
            map.put(c, map.get(c)+1);
        }

        for(int v : map.values()){
            if(v == 0) return false;
        }

        return true;
    }
}