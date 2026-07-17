class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int i=0 , j=k-1, unsatisfied =0, n = arr.length;
        int a =i , b =j , maxunsatisfied =0;
        for(int x =i; x<j; x++){
            if(grumpy[x]==1) unsatisfied+=arr[x];
        }
        while(j<n){
            if(maxunsatisfied<unsatisfied){
                maxunsatisfied = unsatisfied;
                a = i; b =j;
            }
            i++;j++;
            if(j<n && grumpy[j]==1) unsatisfied +=arr[j]; // ak age gaya
            if(grumpy[i-1]==1) unsatisfied -=arr[i-1]; // piche ak remove ho gaya

        }
        for(int x=a; x<=b;x++){
            grumpy[x] = 0;
        }
        int satisfied =0;
        for(int x=0;x<n;x++){
            if(grumpy[x]==0) satisfied+= arr[x];
        }
        return satisfied;
    }
}