
class Solution {
    //static int[] dp;
    public int tribonacci(int n) {
        int[] dp =new int[n+1];
        return fibo(n,dp);
    }
    public int fibo(int n,int[] dp){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp[n]!=0) return dp[n]; // dp me kuch hay to ohi ans hay
        int ans = fibo(n-1,dp)+ fibo(n-2,dp)+ fibo(n-3,dp); // sum last 3 num
        dp[n] = ans; // ans ko dp me save karo
        return ans;
    }
}