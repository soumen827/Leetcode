class Solution {
  // TLE problem
     public int minCost(int[] cost,int idx) {

       if(idx==0 || idx==1) return cost[idx];
        return cost[idx] + Math.min(minCost(cost,idx-1),minCost(cost,idx-2));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
       // int[] dp = new int[n];
       // Arrays.fill(dp,-1); // dp me all ele me -1 
        // n  is going from n/n-1 to 0/1
        return Math.min(minCost(cost,n-1),minCost(cost,n-2));
    }
}
