class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int answer = 0;
        boolean odd = false;

        for(int count : map.values()){
            if(count % 2 == 0) answer = answer + count;
            else {
                answer = answer + count - 1;
                odd = true;
            }
        }

        if(odd) answer++;
        
        return answer;
    }
}