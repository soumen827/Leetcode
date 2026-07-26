class Solution {
    public TreeNode inorderPred(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right!=null) temp = temp.right;
        return temp;
    }
    public TreeNode Parent(TreeNode root,TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode temp = root.left;
        while(temp.right.right!=null) temp = temp.right;
        return temp;

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if (root.val==key){
            // 0 child
            if(root.left==null && root.right==null) return null;
            // 1 Child
            else if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                else return root.left;
            }
            // 2 child
            else {
                TreeNode pred = inorderPred(root);
                TreeNode PredParent =  Parent(root,pred);
                 if(root==PredParent){
                    pred.right = root.right;
                    return pred;
                 }
                PredParent.right =pred.left;
                pred.left = root.left;
                pred.right = root.right;
                return pred;
            }
            
        }
        else if(root.val>key) root.left = deleteNode(root.left,key);
        else root.right = deleteNode(root.right,key);
        return root;
    }
}