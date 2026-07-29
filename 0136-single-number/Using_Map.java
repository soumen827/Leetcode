class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)) map.put(ele,2);
            else map.put(ele,1);
        }
        for(int key:map.keySet()){
            int freq = map.get(key);
            if(freq==1) return key;
        }
        return -1;
    }
}
