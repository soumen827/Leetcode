class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int i=0,j=0,a=0,b=0, n = arr.length;
        int k2 =0, count =0;
        while(i<n && arr[i]%2==0) i++; // i ko first odd me
        while(j<n && k2<k){  // j ko Kth odd me le jana. using another k2 variable
            if(arr[j]%2!=0) k2++;
            j++;
        }
        if(k2<k) return 0;// jodi Kta odd no na thake 
        j--;  // Kth odd+1 me chala gaya that resion ak piche  
        b = j+1;
        while(b<n&& arr[b]%2==0) b++; // B ko rakho J ke next odd se ak age 
        b--;  // for ak age 
        while(b<n){  // sliding window
            count+=(i-a+1)*(b-j+1);
            // first window ses 
            //work same for next all window
            a = i+1; // set a 
            i++;while(i<n && arr[i]%2==0) i++; // set i
            j = b+1; // set j
            b = j + 1; // set b
            while(b<n&& arr[b]%2==0) b++;
            b--;
        }
        return count;
    }
}