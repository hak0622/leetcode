class Solution {
    public int characterReplacement(String s, int k) {
        int[]arr = new int[26];

        int left = 0;
        int maxFreq = 0;
        int max = 0;

        for(int right=0; right<s.length(); right++){
            int idx = s.charAt(right) - 'A';
            arr[idx]++;

            maxFreq = Math.max(maxFreq, arr[idx]);

            while(right - left + 1 - maxFreq > k){
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}