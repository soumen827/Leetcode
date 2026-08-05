class Solution {
    // using DP
     public int minCost(int[] cost,int idx,int [] dp) {

       if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];// dp mw already kuch hay
        return dp[idx] = cost[idx] + Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1); // -1 kar do pura arr me if cost me 0 hay to
        // n  is going from n/n-1 to 0/1
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
}