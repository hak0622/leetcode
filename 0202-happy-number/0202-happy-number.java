class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();

        while(n != 1){
            if(set.contains(n)) return false;

            set.add(n);

            int sum = 0;
            String s = n + "";

            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                int num = c - '0';

                sum = sum + num * num;
            }
            n = sum;
        }

        return true;
    }
}