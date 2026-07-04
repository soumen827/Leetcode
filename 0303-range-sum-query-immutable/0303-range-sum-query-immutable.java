class NumArray {
    int[]arr;
    public NumArray(int[] nums) {
        int n = nums.length;
       // arr= Arrays.copyOf(nums,n); // deep copy
       arr = nums; // shallo copy
         
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return arr[right];
        return arr[right]-arr[left-1];
    }
}
