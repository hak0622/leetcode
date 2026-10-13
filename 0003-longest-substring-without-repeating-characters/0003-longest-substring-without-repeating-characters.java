class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character>list = new ArrayList<>();
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(list.contains(c)){
                while(c != list.get(0)){
                    list.remove(0);
                }
                list.remove(0);
            }
            list.add(c);
            answer = Math.max(answer, list.size());
        }
        return answer;
    }
}