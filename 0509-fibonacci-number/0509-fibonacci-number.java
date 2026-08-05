class Solution {
    static int[] dp;
    public int fib(int n) {
        dp =new int[n+1];
        return fibo(n);
    }
    public int fibo(int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n]; // dp me kuch hay to ohi ans hay
        int ans = fibo(n-1)+ fibo(n-2);
        dp[n] = ans; // ans ko dp me save karo
        return ans;
    }
}