class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0;
        while(i<n && nums[i]<0 && k>0 ){ // i<n for idx out of bound
            nums[i]*= -1;
            i++;
            k--;
        }
        if(k%2==1){ // for k is odd
            Arrays.sort(nums);
            nums[0]*= -1; // sabse chote me -1
        }
        int sum=0;
        for(int j=0;j<n;j++){ // for adding array all element
            sum+=nums[j];
        }
        return sum;
    }
}