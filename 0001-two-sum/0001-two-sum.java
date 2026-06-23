class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans ={-1,-1};
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //              ans[0] =i;
        //              ans[1] =j;
        //         }
        //     }
        // }
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = nums[i];
            int remaining = target - key;
            if(map.containsKey(remaining)){
                 
                 ans[0] =i;
                 ans[1] = map.get(remaining);
                 break;
            }else map.put(key,i);

        }
        return ans;
    }
}