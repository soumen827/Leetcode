class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)) map.put(ele,2); // pehelese ak hay to 2 kardo
            else map.put(ele,1);
        }
        for(int key:map.keySet()){
            int freq = map.get(key);
            if(freq==1) list.add(key);
        }
        int[] ans = new int[2];
        ans[0]= list.get(0); ans[1] = list.get(1); // list se ans me past
        return ans;
    }
}