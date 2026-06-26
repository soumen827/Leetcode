class Solution {
     public TreeNode helper(int[] preorder,int[]inorder,int Plo,int Phi,int Ilo, int Ihi) {
        if(Plo>Phi || Ilo>Ihi) return null; // Base Case
        TreeNode root = new TreeNode(preorder[Plo]);
        int r =0;

        while(inorder[r]!=preorder[Plo]) r++;
            int leftSize = r-Ilo;
        root.left = helper(preorder,inorder,Plo+1,Plo+leftSize,Ilo,r-1);
       root.right = helper(preorder,inorder,Plo+leftSize+1,Phi,r+1,Ihi);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
}