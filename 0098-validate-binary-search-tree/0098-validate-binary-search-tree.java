class Solution {
    // static boolean flage;
    // public long max(TreeNode root){
    //     if(root==null) return Long.MIN_VALUE;
    //     long leftTree = max(root.left);
    //     if(leftTree>=root.val) flage = false;
    //     long  rightTree = max(root.right);
    //     return Math.max(root.val,Math.max(leftTree,rightTree));
    // }
    // public long min(TreeNode root){
    //     if(root==null) return Long.MAX_VALUE;
    //     long leftTree = min(root.left);
    //     long rightTree =min(root.right);
    //     if(rightTree<=root.val) flage = false;
    //     return Math.min(root.val,Math.min(leftTree,rightTree));
    // }
    // public boolean isValidBST(TreeNode root) {
    //     // if(root==null) return true;
    //     //if(root.left==null && root.right==null) return true;
    //     // if(root.val<=max(root.left)) return false;
    //     // if(root.val>=min(root.right)) return false;
    //     // return isValidBST(root.left) && isValidBST(root.right);
    //     flage = true;
    //     min(root);
    //     max(root);
    //     return flage;

    // }
    public void inorder(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);

    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= arr.get(i - 1))
                return false;
        }

        return true;

    }
}