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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode root = null;
        
        if(nums.length == 1) {
            root = new TreeNode(nums[0]);
        } else if(nums.length == 2) {
            root = new TreeNode(nums[1]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, 1));
        } else if(nums.length == 3) {
            root = new TreeNode(nums[1]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, 1));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, 2, 3));
        } else if(nums.length > 3){
            int halfIndex = nums.length % 2 == 0 ? nums.length / 2 : (nums.length / 2) + 1;
            root = new TreeNode(nums[halfIndex]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, halfIndex));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, halfIndex+1, nums.length));
        }
        
        return root;
    }
}
