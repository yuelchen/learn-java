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
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        } else if(root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        } else if(root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        } else if(root.left == null && root.right == null) {
            return 1;
        } else {
            int leftDepth = minDepth(root.left);
            int rightDepth = minDepth(root.right);
            
            return leftDepth >= rightDepth ? rightDepth + 1 : leftDepth + 1;
        }
    }
}
