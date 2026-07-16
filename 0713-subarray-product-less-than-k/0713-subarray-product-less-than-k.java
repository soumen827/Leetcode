class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0;
        int n = arr.length;
        int i = 0;
        int product = 1;
        int count = 0;

        for (int j = 0; j < n; j++) {
            // Expand the window
            product *= arr[j];

            // Shrink the window until product becomes < k
            while (product >= k) {
                product /= arr[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}