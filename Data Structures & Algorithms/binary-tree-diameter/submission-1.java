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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // 62 minutes
        // it was difficult to understand the task, what is the diameter and how to calculate it. Then I've identified 
        // the difference between diameter and depth and what value to send up how to calculate diameter in the intermediate states
        
        calcDiameter(root);
        return diameter;
    }

    int calcDiameter(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int depthLeft = calcDiameter(root.left);
        int depthRight = calcDiameter(root.right);

        diameter = Math.max(diameter, depthLeft + depthRight);

        return 1 + Math.max(depthLeft, depthRight);
    }
}
