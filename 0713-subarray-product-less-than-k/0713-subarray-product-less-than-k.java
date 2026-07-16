class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // If k is 0 or 1, no positive product can be less than k
        if (k <= 1) return 0;
        int n = nums.length;
        int i = 0;
        int product = 1;
        int count = 0;

        for (int j = 0; j < n; j++) {
            // Expand the window
            product *= nums[j];

            // Shrink the window until product becomes < k
            while (product >= k) {
                product /= nums[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}