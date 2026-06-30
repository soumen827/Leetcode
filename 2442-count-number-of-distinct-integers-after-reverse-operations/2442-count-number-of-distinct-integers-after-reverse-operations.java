class Solution {
    public int reverse(int nums){
        int r=0;
        while(nums>0){
            r = r*10 + nums%10;
            nums /= 10;
        }
        return r;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        } 
        return set.size();
    }
     
}