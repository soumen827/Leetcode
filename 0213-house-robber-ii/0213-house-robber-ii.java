class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // Edge cases
        if (n == 1) return nums[0];
        // Case 1: Rob houses from 0 to n-2
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = amount(nums, 0, n - 2, dp1); // first -- last-1
        // Case 2: Rob houses from 1 to n-1
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = amount(nums, 1, n - 1, dp2); // first+1 -- last

        return Math.max(case1, case2);
    }
    public int amount(int[] nums, int i, int end, int[] dp) {
        if (i > end) return 0;
        if (dp[i] != -1) return dp[i];
        int take = nums[i] + amount(nums, i + 2, end, dp);
        int skip = amount(nums, i + 1, end, dp);
        return dp[i] = Math.max(take, skip);
    }
}