class Solution {
    public int longestOnes(int[] arr, int k) {

        int n = arr.length;
        int i = 0, j = 0, zeros = 0, maxLen = 0;
        // Build the first valid window
        while (j < n) {
            if (arr[j] == 0) {
                if (zeros == k)
                    break;
                zeros++;
            }
            j++;
        }
        j--;

        while (i < n && j < n) {

            maxLen = Math.max(maxLen, j - i + 1);

            // Remove left element
            if (arr[i] == 0)
                zeros--;
            i++;

            // Expand right until window becomes valid again
            j++;
            while (j < n) {
                if (arr[j] == 0) {
                    if (zeros == k)
                        break;
                    zeros++;
                }
                j++;
            }
            j--;
        }
        
        return maxLen;
    }
}