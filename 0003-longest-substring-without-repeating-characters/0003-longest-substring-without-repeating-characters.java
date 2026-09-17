class Solution {
    public int lengthOfLongestSubstring(String s) {
        String len = "";
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(len.contains(String.valueOf(c))){
                int idx = len.indexOf(c);
                len = len.substring(idx+1);
            }
            len = len + c;
            answer = Math.max(answer, len.length());
        }
        return answer;
    }
}

//System.out.println(i+"번째 =" + c);