class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int j = 0; j < n; j++) {

            if (arr[j] == 0)
                zeros++;

            while (zeros > k) { // same as 1493 only this line change
                if (arr[i] == 0)
                    zeros--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}