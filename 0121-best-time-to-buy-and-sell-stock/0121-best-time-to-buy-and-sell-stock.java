class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int gain = 0;

        for(int i=0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            gain = Math.max(gain,prices[i] - min);
        }
        return gain;
    }
}