class Solution {
    public void inorder(TreeNode root, List<Integer> ans){
        if(root==null) return ;
         inorder(root.left,ans);
         ans.add(root.val);
         inorder(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
        //  inorder(root,ans);
        //  return ans;
                        //ITERATIVE//
        // Stack<TreeNode> st = new Stack<>();
        // TreeNode temp = root;
        // while(true){
        //     if(temp!=null){
        //         st.push(temp);
        //         temp = temp.left;
        //     }else{
        //         if(temp==null && st.isEmpty()) break;
        //         TreeNode top = st.pop();
        //         ans.add(top.val);
        //         temp = top.right;
        //     }
        // }
        // return ans;
                              // Morris Traversal //
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right!=curr) pred = pred.right;
                if(pred.right==null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                     
                }
                
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
     }
}