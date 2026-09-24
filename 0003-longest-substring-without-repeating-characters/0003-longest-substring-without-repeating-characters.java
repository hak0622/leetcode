class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character>list = new ArrayList<>();
        int max = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            while(list.contains(c)){
                list.remove(0);
            }
            list.add(c);

            max = Math.max(max, list.size());
        }

        return max;
    }
}