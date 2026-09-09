class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int[]Fibo = new int[n+1];
        Fibo[0] = 0;
        Fibo[1] = 1;

        for(int i=2; i<=n; i++){
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }

        return Fibo[n];
    }
}