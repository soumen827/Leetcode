// class Solution {
//     public int[] searchRange(int[] arr, int target) {
//         int n =arr.length;
//         int ans[] = new int[2];
//         int fp = -1;
//         int lo=0,hi=n-1;
//         while(lo<=hi){ // First Position
//             int mid = lo+(hi-lo)/2;
//             if(arr[mid]==target){
//                 if(mid>0 && arr[mid]==arr[mid-1])
//                     hi =mid-1;
                
//                 else{
//                     fp= mid;
//                      break;
//                 }
//             }
//             else if(arr[mid]>target) hi = mid-1;
//             else if(arr[mid]<target) lo = mid+1;

//         }
//         // Last Position
//         int lp =-1; lo=0; hi= n-1;
//         while(lo<=hi){ // last Position
//             int mid = lo+(hi-lo)/2;
//             if(arr[mid]==target){
//                 if(arr[mid]==arr[mid+1] && mid+1<n)
//                     lo= mid+1;

//                 else{
//                     lp= mid;
//                     break;
//                 }
//             }
//             else if(arr[mid]>target)  hi =mid-1;
//             else if(arr[mid]<target)  lo = mid+1;

//         }
//         ans[0] =fp; ans[1] = lp;
//         return ans;
        
//     }
// }
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res = mid;
                high = mid - 1; // go left to find earlier occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res = mid;
                low = mid + 1; // go right to find later occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}