class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>map1 = new HashMap<>();
        
        int len1 = s1.length();

        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(int i=0; i+len1 <= s2.length(); i++){
            HashMap<Character,Integer>map2 = new HashMap<>();
            String s = s2.substring(i,len1 + i);

            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                map2.put(c, map2.getOrDefault(c,0)+1);
            }

            if(map1.equals(map2)) return true;
        }
        return false;
    }
}