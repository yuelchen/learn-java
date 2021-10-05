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
    
    private Map<Integer, Integer> valueToCounts = new HashMap<>();
    
    public int[] findMode(TreeNode root) {
        
        setMapping(root);
        
        List<Integer> modes = new ArrayList<>();
        int largestCount = 0;
        
        for(Map.Entry<Integer, Integer> valueToCount : valueToCounts.entrySet()) {
            if(valueToCount.getValue() > largestCount) {
                largestCount = valueToCount.getValue();
                modes.clear();
                modes.add(valueToCount.getKey());
            } else if(valueToCount.getValue()  == largestCount) {
                modes.add(valueToCount.getKey());
            }
        }
        
        int[] modeArray = new int[modes.size()];
        int counter = 0;
        for(Integer mode : modes) {
            modeArray[counter] = mode;
            counter++;
        }
        
        return modeArray;
        
    }
    
    private void setMapping(TreeNode root) {
        
        if(root == null) {
            return;
        }
        
        if(root.left != null) {
            setMapping(root.left);
        }
        
        if(root.right != null) {
            setMapping(root.right);
        }
        
        Integer rootValue = new Integer(root.val);
        if(valueToCounts.containsKey(rootValue)) {
            valueToCounts.put(rootValue, valueToCounts.get(rootValue) + 1);
        } else {
            valueToCounts.put(rootValue, 1);
        }
    }
}
