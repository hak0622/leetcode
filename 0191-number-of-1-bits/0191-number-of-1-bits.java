class Solution {
    public int hammingWeight(int n) {
        int answer = 0;
        String s = Integer.toString(n , 2);

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '1') answer++;
        }
        return answer;
    }
}