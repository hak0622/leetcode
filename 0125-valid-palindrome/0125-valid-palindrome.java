class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(!Character.isLetterOrDigit(c)){
                continue;
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }

        for(int i=0; i<sb.length()/2; i++){
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(sb.length() - i - 1);

            if(c1 != c2){
                return false;
            }
        }

        return true;
    }
}