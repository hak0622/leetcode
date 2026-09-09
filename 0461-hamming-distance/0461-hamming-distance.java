class Solution {
    public int hammingDistance(int x, int y) {
        String xBit = Integer.toString(x,2);
        String yBit = Integer.toString(y,2);

        int max = Math.max(xBit.length(),yBit.length());

        int xZero = max - xBit.length();
        int yZero = max - yBit.length();

        for(int i=0; i<xZero; i++){
            xBit = "0" + xBit;
        }
        for(int i=0; i<yZero; i++){
            yBit = "0" + yBit;
        }

        int count = 0;

        for(int i=0; i<max; i++){
            if(xBit.charAt(i) != yBit.charAt(i)) count++;
        }

        return count;
    }
}