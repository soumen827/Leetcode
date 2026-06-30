 class Solution {
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE, high = 0;

        // Find the search space (min and max house values)
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        // Perform binary search for the minimum possible max sum
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canRobWithMaxSum(nums, mid, k)) {
                high = mid; // Try a smaller max sum
            } else {
                low = mid + 1; // Increase the max sum
            }
        }
        return low;
    }

    // Check if we can pick k houses such that the max robbed sum ≤ `limit`
    private boolean canRobWithMaxSum(int[] nums, int limit, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= limit) {
                count++;
                i++; // Skip the next house (because adjacent houses can't be robbed)
                if (count >= k) return true; // We found k valid houses
            }
        }
        return false;
    }
}
