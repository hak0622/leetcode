class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        int answer = 0;

        while(n > 0){
            n = n - row;
            if(n < 0) break;
            answer++;
            row++;
        }
        return answer;
    }
}