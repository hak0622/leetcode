import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character>list = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        int idx = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(vowels.contains(String.valueOf(c))){
                list.add(c);
            }
        }

        Collections.reverse(list);

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(vowels.contains(String.valueOf(c))){
                sb.append(list.get(idx++));
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}