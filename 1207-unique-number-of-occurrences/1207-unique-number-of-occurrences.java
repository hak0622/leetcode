import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();

        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(int m : map.values()){
            set.add(m);
        }

        return map.size() == set.size();
    }
}