class Solution {
    //TLE problem
    public int rob(int[] nums) {
        int n = nums.length;
        return amount(nums,0);
    }
    public int amount(int[] nums,int i) {
        int n = nums.length;
        if(i>=n) return 0;
        int take = nums[i] + amount(nums,i+2);
        int skip = amount(nums,i+1);
        return dp[i] = Math.max(take,skip);
    }
}
