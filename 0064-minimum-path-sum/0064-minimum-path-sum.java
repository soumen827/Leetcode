class Solution {
    public int minPathSum(int[][] arr) {
        // without using the extra space
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;//for 1st ele
                else if(i==0) arr[i][j] += arr[i][j-1];//for row changing
                else if(j==0) arr[i][j] += arr[i-1][j];// for col changing
                else arr[i][j] += Math.min(arr[i][j-1],arr[i-1][j]); // original dp formula
            }
        }
        return arr[m-1][n-1];
    }
}