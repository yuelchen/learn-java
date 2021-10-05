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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        } else {
            int maxLeftHeight = getMaxHeightAtNode(root.left);
            int maxRightHeight = getMaxHeightAtNode(root.right);
            int difference = maxLeftHeight >= maxRightHeight ? 
                maxLeftHeight - maxRightHeight :
                maxRightHeight - maxLeftHeight;
            
            return (difference <= 1 && isBalanced(root.left) && isBalanced(root.right));
        }
    }
    
    public int getMaxHeightAtNode(TreeNode node) {
        if(node == null) {
            return 0;
        } else {
            int leftHeight = getMaxHeightAtNode(node.left);
            int rightHeight = getMaxHeightAtNode(node.right);
            
            return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
        }
    }
}
