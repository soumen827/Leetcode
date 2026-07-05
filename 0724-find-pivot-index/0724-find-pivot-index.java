class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ans =0;

        for(int i=0;i<n;i++){
            int leftSum =0, rightSum =0;
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }
            for(int j=i+1;j<n;j++){
                rightSum += nums[j];
            }
            if(leftSum==rightSum) return ans+i;
        }
        return -1;
    }
}