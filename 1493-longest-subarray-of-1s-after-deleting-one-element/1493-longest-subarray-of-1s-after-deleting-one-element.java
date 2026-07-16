class Solution {
    public int longestSubarray(int[] arr) {
        int i=0, j=0 , n = arr.length, zeros =0, maxLen =0;
        // extra case for all 1's ;
        int z =0;
        for(int ele:arr){
            if(ele==0) z++;
        }
        if(z==0) return n-1; // remove one 1'
        
        while(i<n && arr[i]==0) i++;
        if(i==n) return 0;
        j=i;
        while(j<n){
            if(arr[j]==1) j++;
            else{  // arr[j]==0 
                if(zeros ==0 ){
                    j++;
                    zeros++;
                }
                else{ // zeros =1;
                    int len = j-i-1;
                    maxLen = Math.max(maxLen,len);
                    j++;
                    while(arr[i]==1) i++; // 0pe ayaga 
                    i++; // next 1
                }
            }
        }
        if(zeros==0) return j-i; // 0 1 1 is diff from 11
        int len = j-i-1;
        maxLen = Math.max(maxLen,len);
        return maxLen;

    }
}