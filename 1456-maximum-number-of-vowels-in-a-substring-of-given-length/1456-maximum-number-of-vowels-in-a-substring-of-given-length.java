class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        for(int i=0; i<k; i++){
            if(vowel(s.charAt(i))) count++;
        }

        int max = count;

        for(int i=k; i<s.length(); i++){
            if(vowel(s.charAt(i - k))) count--;
            if(vowel(s.charAt(i))) count++;

            max = Math.max(max, count);
        }
        return max;
    }

    public boolean vowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}