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
        // 14 - 19 = 5 minutes 
        // had some problem with visualization of logic order execution but after 
        // pronouncing what I am going to to it became clearer to see the flow of 
        // the logic execution 
        if(root == null) {
            return 0;
        } 

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        return 1 + Math.max(depthLeft, depthRight);
    }


}
