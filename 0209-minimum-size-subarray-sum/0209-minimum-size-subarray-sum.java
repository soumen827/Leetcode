class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int n = arr.length;
        int i=0, j=0, sum =0;
        int minLen = Integer.MAX_VALUE;
        while(j<n&& sum<k){ // first window
            sum+=arr[j];
            j++;
        }
        j--;
        while (i<n && j<n) {
            int len = j-i+1;
            if(sum>=k) minLen = Math.min(minLen, j - i + 1);
            sum -= arr[i];
            i++; j++;
            while(j<n && sum<k){
                sum+= arr[j++];
            }
            j--;
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }
}