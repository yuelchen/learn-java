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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();
        
        if(root == null) {
            return levelOrder;
        } else {
            
            //get nested list from left
            List<List<Integer>> leftLevelOrder = new ArrayList<List<Integer>>();
            if(root.left != null) {
                leftLevelOrder = levelOrderBottom(root.left);
            }
            
            //get nested list from right
            List<List<Integer>> rightLevelOrder = new ArrayList<List<Integer>>();
            if(root.right != null) {
                rightLevelOrder = levelOrderBottom(root.right);
            }
            
            levelOrder = mergeNestedLists(leftLevelOrder, rightLevelOrder);
            
            List<Integer> currentLevelList = new ArrayList<Integer>();
            currentLevelList.add(root.val);
            levelOrder.add(currentLevelList);
            
            return levelOrder;
        }
        
    }
    
    private List<List<Integer>> mergeNestedLists(List<List<Integer>> leftLevelOrder, List<List<Integer>> rightLevelOrder) {
        
        if(leftLevelOrder.size() == 0 && rightLevelOrder.size() > 0) {
            return rightLevelOrder;
            
        } else if(leftLevelOrder.size() > 0 && rightLevelOrder.size() == 0) {
            return leftLevelOrder;
            
        } else {
            
            int smallestNested = leftLevelOrder.size() >= rightLevelOrder.size() ? 
                rightLevelOrder.size() : leftLevelOrder.size();
            int largestNested = leftLevelOrder.size() >= rightLevelOrder.size() ? 
                leftLevelOrder.size() : rightLevelOrder.size();
            
            List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();
            for(int i=0; i<largestNested; i++) {
                
                List<Integer> levelList = new ArrayList<Integer>();
                if(leftLevelOrder.size() + i >= largestNested) {
                    int index = (leftLevelOrder.size() + i) - largestNested;
                    levelList.addAll(leftLevelOrder.get(index));
                }
                
                if(rightLevelOrder.size() + i >= largestNested) {
                    int index = (rightLevelOrder.size() + i) - largestNested;
                    levelList.addAll(rightLevelOrder.get(index));
                }
                
                levelOrder.add(levelList);
                
            }
            
            return levelOrder;
        }
        
    }
}
