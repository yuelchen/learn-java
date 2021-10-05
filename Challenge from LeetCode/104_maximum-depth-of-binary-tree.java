/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;  
        } else if(root.left == null && root.right == null) {
            return 1;
        } else {
            
            //get max from left; 
            int leftDepth = maxDepth(root.left) + 1;
            
            //get max from right;
            int rightDepth = maxDepth(root.right) + 1;
            
            return leftDepth >= rightDepth ? leftDepth : rightDepth;
        }
    }
    
}
