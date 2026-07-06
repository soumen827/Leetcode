class Solution {
    public long[] findPrefixScore(int[] arr) {
        int max =0;
        int n = arr.length;
        long[] arr2 = new long[n];
         
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            arr2[i] = arr[i]+max;
        }
        for(int i=1;i<n;i++){
            arr2[i]+=arr2[i-1];
        }
        return arr2;
    }
}