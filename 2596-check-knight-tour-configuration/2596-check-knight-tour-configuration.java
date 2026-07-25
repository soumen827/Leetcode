class Solution {
    public boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;
        int i, j;
        // Base case
        if (grid[row][col] == n * n - 1)
            return true;
        // 2up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2up right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2 down left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2 down right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2 right up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2 right down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2 left up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        // 2 left down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);
        return false;

    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0)
            return false;
        return helper(grid, 0, 0, 0); // row col valu
    }
}