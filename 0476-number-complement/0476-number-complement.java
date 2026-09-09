class Solution {
    public int findComplement(int num) {
        String s = Integer.toString(num,2);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '1') sb.append("0");
            else sb.append("1");
        }
        return Integer.parseInt(sb.toString(),2);
    }
}