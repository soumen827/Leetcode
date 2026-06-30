class Solution {
    public boolean isPossible( int maxQ,int m ,int arr[]){
        int stores =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxQ==0) stores += arr[i]/maxQ;
            else stores +=arr[i]/maxQ+1;
        }
        if(stores>m) return false;
        else return true;
    }

    public int minimizedMaximum(int m, int[] arr) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx =Math.max(mx,arr[i]);

        }
        int lo=1,hi=mx, ans=0;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(isPossible(mid,m,arr)){
                ans= mid;
                hi=mid-1;

            }
            else lo= mid+1;
        }
        return ans;
        
        
    }
}