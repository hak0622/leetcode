class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;

        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if((c >='a' && c <='z') || (c>= 'A' && c<='Z') || (c>='0' && c<='9')){
                if(c >= 'A' && c <='Z'){
                    sb.append(Character.toLowerCase(c));
                }else{
                    sb.append(c);
                }
            }
        }

        for(int i=sb.length()-1; i>=0; i--){
            char c = sb.charAt(i);

            if(sb.charAt(idx) != c){
                return false;
            }
            idx++;
        }
        return true;
    }
}