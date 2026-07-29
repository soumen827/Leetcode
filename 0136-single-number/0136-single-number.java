class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i]!=nums[i+1]) return nums[i];// same heni hay to ohi ans
            else i+=2; // nehi to 2 jamp karo and age baro
        }
        return nums[n-1]; // last se vi 2 jamp ho ho raha so return last
    }
}