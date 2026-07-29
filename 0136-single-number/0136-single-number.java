class Solution {
    public int singleNumber(int[] nums) {
        int ans=0; // me janta hu sab 2 bar karke hay to ^ karunga to 0 hoga 
        for(int ele:nums){
            ans = ans ^ ele; // only one single bachega
        }
        return ans;
    }
}