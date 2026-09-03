import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();

        while(n != 1){
            int sum = 0;
            String s = n + "";
            char[] c = s.toCharArray();

            for(int i=0; i<c.length; i++){
                int num = c[i] - '0';
                sum = sum + num * num;
            }

            if(set.contains(sum)) return false;
            set.add(sum);
            n = sum;
        }

        return true;
    }
}