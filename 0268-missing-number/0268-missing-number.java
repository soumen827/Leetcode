class Solution {
    public void swap(int i, int j, int[] arr){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i || arr[i]==n) i++;
            else swap(i,arr[i],arr);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i) return i;

        }
        
       return i;
    }
}