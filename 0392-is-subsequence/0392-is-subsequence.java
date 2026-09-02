class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;

        char c1 = s.charAt(0);
        int idx1 = t.indexOf(c1);

        if(idx1 == -1) return false;

        for(int i=1; i<s.length(); i++){
            char c2 = s.charAt(i);
            int idx2 = t.indexOf(c2, idx1 + 1);

            if(idx2 == -1) return false;

            idx1 = idx2;
        }
        return true;
    }
}