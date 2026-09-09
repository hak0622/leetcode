class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        
        while(s.length() < 32){
            s = "0" + s;
        }

        String reverse = new StringBuilder(s).reverse().toString();

        return (int)Long.parseLong(reverse,2);
    }
}