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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        } else if(root.left != null || root.right != null) {
            //not leaf node (has at least one child) so continue
            int difference = sum - root.val;
            boolean leftResult = hasPathSum(root.left, difference);
            boolean rightResult = hasPathSum(root.right, difference);
            return leftResult || rightResult;
        } else {
            //leaf node (has no child)
            int difference = sum - root.val;
            return difference == 0;
        }
    }
}
