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
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root == null) {
            return new ArrayList<String>();
        }
        
        List<String> list = new ArrayList<>();
        if(root.left == null && root.right == null) {
            String input = Integer.toString(root.val);
            list.add(input);
        } else {
            
            if(root.left != null) {
                List<String> leftNodes = binaryTreePaths(root.left);
                for(String leftNode : leftNodes) {
                    String input = Integer.toString(root.val).concat("->").concat(leftNode);
                    list.add(input);
                }
            }
            
            if(root.right != null) {
                List<String> rightNodes = binaryTreePaths(root.right);
                for(String rightNode : rightNodes) {
                    String input = Integer.toString(root.val).concat("->").concat(rightNode);
                    list.add(input);
                }
            }
        }
        
        return list;
    }
}
