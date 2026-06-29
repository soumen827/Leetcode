class Solution {
    public TreeNode convert(List<TreeNode> arr,int lo,int hi){
        int mid = lo+(hi-lo)/2;
        if(lo>hi) return null;
        
        TreeNode root = new TreeNode(arr.get(mid).val);
        root.left = convert(arr,lo,mid-1);
        root.right = convert(arr,mid+1,hi);
        return root;
    }
    public void inorder(TreeNode root,List<TreeNode>arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);


    }
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        int n = arr.size();
        return convert(arr,0,n-1);
        
    }
}