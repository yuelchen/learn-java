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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        } else if(root.left == null && root.right == null) {
            return true;
        } else if(root.left != null && root.right != null) {
            String leftValue = getCenterLeftRight(root.left);
            String rightValue = getCenterRightLeft(root.right);
            return leftValue.equals(rightValue);
        } else {
            return false;
        }
    }
    
    public String getCenterLeftRight(TreeNode node) {
        String value = Integer.toString(node.val);
        
        if(node.left != null) {
            value += getCenterLeftRight(node.left);
        } else {
            value += "-";
        }
        
        if(node.right != null) {
            value += getCenterLeftRight(node.right);
        } else {
            value += "-";
        }
        
        System.out.println("getCenterLeftRight(" + node.val + "): " + value);
        return value;
    }
    
    public String getCenterRightLeft(TreeNode node) {
        String value = Integer.toString(node.val);
        
        if(node.right != null) {
            value += getCenterRightLeft(node.right);
        } else {
            value += "-";
        }
        
        if(node.left != null) {
            value += getCenterRightLeft(node.left);
        } else {
            value += "-";
        }
        
        System.out.println("getCenterRightLeft(" + node.val + "): " + value);
        return value;
    }
}
