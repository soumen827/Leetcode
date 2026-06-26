class Solution {
    static boolean ans;
    public boolean isBalanced(TreeNode root) {
        ans = true;
        levels(root);
        return ans ;
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        int diff = Math.abs(leftLevels-rightLevels);
        if(diff>1) ans = false;
        return 1 +Math.max(leftLevels,rightLevels);

    }
}