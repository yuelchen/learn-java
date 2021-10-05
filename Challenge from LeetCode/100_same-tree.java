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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) {
            return true;
            
        } else if ((p != null && q == null) || (p == null && q != null) || (p.val != q.val)) {
            return false;
            
        } else {
            
            //check left node
            boolean leftResult = false;
            if(p.left != null && q.left != null) {
                leftResult = isSameTree(p.left, q.left);
            } else if(p.left == null && q.left == null) {
                leftResult = true;
            } 
            
            //check right node
            boolean rightResult = false;
            if(p.right != null && q.right != null) {
                rightResult = isSameTree(p.right, q.right);
            } else if(p.right == null && q.right == null) {
                rightResult = true;
            }
            
            return (leftResult && rightResult);
        }
    }
}
