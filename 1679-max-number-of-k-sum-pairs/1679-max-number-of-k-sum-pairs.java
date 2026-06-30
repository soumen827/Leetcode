class Solution {
    public int maxOperations(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<>();
         int count =0;
        int n = nums.length;
         for(int i=0;i<n;i++){
            int ele = k-nums[i];
            if(map.containsKey(ele) && map.get(ele)!=0){
                int freq = map.get(ele);
                count++;
                // count %= 1000000007;
                map.put(ele,freq-1);
            }else map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        return count;
    }
}