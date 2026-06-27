class Solution {
      int count =0;
      int result =0;
    public void inorder(TreeNode root, int k){
     if(root==null) return;
     inorder(root.left,k); // left

        count++;
        if(count==k){
            result = root.val;   //ROOT
            return;

        }      

     inorder(root.right, k); // right

    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result;
    //     TreeNode curr =root;
    //     int count =0;
    //       while(curr!=null){
    //         if(curr.left!=null){
    //             TreeNode pred = curr.left;
    //             while(pred.right!=null && pred.right!=curr) pred = pred.right;
    //             if(pred.right==null){
    //                 pred.right = curr;
    //                 curr = curr.left;
    //             }else{
    //                 pred.right = null;
    //                 count++;
    //                  if(count==k) return curr.val;
    //                  curr = curr.right;
                
    //         }
    //         }
    //         else{
    //              count++;
    //             if(count==k) return curr.val;
    //              curr = curr.right;
            
    //         }
        
    // }
    //   return -1;
}
}
