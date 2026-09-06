class Solution {
    public int addDigits(int num) {
        while(num / 10 != 0){
            int n = num / 10;
            int m = num % 10;

            num = n + m;
        }
        return num;
    }
}