class Solution {
    // public void flatten(TreeNode root) {
    //     if(root==null) return ;
    //     if(root.left==null && root.right==null) return;

    //     TreeNode lst = root.left;
    //     TreeNode rst = root.right;
    //     flatten(lst);
    //     flatten(rst);
    //     root.left = null;
    //     root.right = lst;
    //     TreeNode temp = root;
    //      while(temp.right!=null) temp = temp.right;

    //     temp.right = rst; 
    // }
     public void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode r = curr.right;
                curr.right = curr.left;
                TreeNode pred = curr.left;
                while(pred.right!=null) pred = pred.right;
                pred.right = r;
                curr.left = null;
                curr = curr.right;
            } else curr = curr.right;
        }

     }
}