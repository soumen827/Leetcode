class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        // int noofzero =0, noofones =0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0) noofzero++;
        //     if(arr[i]==1) noofones++;
        // }
        // for(int i=0; i<n;i++){
        //     if(i<noofzero) arr[i] =0;
        //     else if (i<noofzero+noofones) arr[i] = 1;
        //     else arr[i] =2;
        // }
         int mid =0;
      int high = n-1;
      int low = 0;
      while (mid<=high) {
        if(arr[mid]==0){
          int temp = arr[low];
          arr[low] = arr[mid];
          arr[mid] = temp;
          low++ ; mid++;
        }
        else if(arr[mid]==1){
          mid++;
        }
        else if(arr[mid]==2){
          int temp = arr[mid ];
          arr[mid] = arr[high];
          arr[high] = temp;
          high--;
        }
      }
    }
}