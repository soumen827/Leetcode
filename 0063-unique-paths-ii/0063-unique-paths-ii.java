class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        // Starting cell is an obstacle
        if (arr[0][0] == 1) return 0;
        dp[0][0] = 1; // first ele 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Obstacle
                if (arr[i][j] ==1) dp[i][j] = 0;
                else {
                    if (i > 0) dp[i][j] += dp[i - 1][j];
                    if (j > 0) dp[i][j] += dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}