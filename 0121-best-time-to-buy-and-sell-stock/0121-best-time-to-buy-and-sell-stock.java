class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int money = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else{
                money = Math.max(money, price - minPrice);
            }
        }
        return money;
    }
}