class Solution {
    public int rev(int n){
        int r=0;
        while(n>0){
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
    public int countNicePairs(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
         int count =0;
        int n = arr.length;
         for(int i=0;i<n;i++){
            int ele = arr[i]-rev(arr[i]);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                count+=freq;
                count %= 1000000007;
                map.put(ele,freq+1);
            }else map.put(ele,1);
        }
        
        return count;
    }
}