class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int move = 0;

        StringBuilder sb = new StringBuilder();

        while(i >=0 || j >= 0){
            int a = i >= 0 ? num1.charAt(i) - '0' : 0;
            int b = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = a + b + move;

            sb.append(sum % 10);
            move = sum / 10;
            i--;
            j--;
        }
        
        if(move > 0) sb.append(move);

        return sb.reverse().toString();
    }
}