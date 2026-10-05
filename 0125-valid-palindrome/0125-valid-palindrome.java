class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char leftC = s.charAt(left);
            char rightC = s.charAt(right);

            if(!Character.isLetterOrDigit(leftC)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(rightC)){
                right--;
                continue;
            }

            if(Character.toLowerCase(leftC) != Character.toLowerCase(rightC)) return false;

            left++;
            right--;
        }
        return true;
    }
}