class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int i=0, j=k-1, sum=0,count = 0;
        int n = arr.length;
        for(int a =0; a < k; a++){
            sum += arr[a];
        }
        int Avg = sum/k;
            if(Avg>=t) count ++;
        i++; j++;
        while(j<n){
            sum = sum- arr[i-1] + arr[j];
            Avg = sum/k;
            if(Avg>=t) count ++;
            i++;j++;
        }
        return count;
    }
}