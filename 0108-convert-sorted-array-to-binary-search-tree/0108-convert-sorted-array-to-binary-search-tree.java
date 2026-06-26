class Solution {
    public TreeNode  converat(int[] arr, int lo, int hi){
        int mid = lo+(hi-lo)/2;
        if(lo>hi) return null;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = converat(arr,lo,mid-1);
        root.right = converat(arr,mid+1,hi);
        return root;

    }
    public TreeNode sortedArrayToBST(int[] arr) {
        int n = arr.length;
        return converat(arr,0,n-1);
    }
}