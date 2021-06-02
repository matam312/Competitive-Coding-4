package Tree1;

//https://leetcode.com/problems/balanced-binary-tree/

public class HeadBalancedBT {
    
    
    public boolean isBalanced(TreeNode root)
   {
       if(root == null) return true;
        
        return Math.abs(height(root.left)-height(root.right)) < 2
                   && isBalanced(root.left)
                       && isBalanced(root.right);
   }
   

   private int height(TreeNode root)
   {
       if(root == null ) return -1;
       
       return 1 +Math.max(height(root.left), height(root.right));        
      
   }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
}
