class Solution {
    public  int level(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }
    private static void nThLevel(TreeNode root, int level, int lvl,List<Integer> arr){
        if(root==null) return;
        if(level>lvl) return ;
        if(level==lvl) arr.add(root.val);
         if(lvl % 2 == 0){
            nThLevel(root.left, level + 1, lvl, arr);
            nThLevel(root.right, level + 1,lvl , arr);
        } else {
            nThLevel(root.right, level + 1, lvl, arr);
            nThLevel(root.left, level + 1, lvl, arr);
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for(int i=0;i<lvl;i++){
            List<Integer> arr = new ArrayList<>();
            nThLevel(root,0,i,arr);
            ans.add(arr);
        }
       
        return ans;
    }
}