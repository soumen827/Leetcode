class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int i=0, j=0, MaxLen =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            // fiest step map me first ele dalo
            if(map.containsKey(arr[j])){
                int freq = map.get(arr[j]);
                map.put(arr[j],freq+1);
            }else map.put(arr[j],1);
            // reduce
            while(map.size()>2){
                int freq = map.get(arr[i]);
                if(freq==1) map.remove(arr[i]);
                else map.put(arr[i],freq-1);
                i++;
            }
            // length
            int len = j-i+1;
            MaxLen = Math.max(MaxLen,len);
            j++;

        }
        return MaxLen;
    }
}