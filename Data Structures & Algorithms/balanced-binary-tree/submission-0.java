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
        // 15 minutes. Stack with visualization and holding 4 problems:
        // 1 count length
        // 2 propogate up value if not balanced
        // 3 propogate not boolean but length indicator in number
        // 4 split logic between "isBalanced" and "height" methods
        return height(root) == -1 ? false : true;
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftH = height(root.left);
        if(leftH == -1) {
            return -1;
        }
        int rightH = height(root.right);
        if(rightH == -1) {
            return -1;
        }

        if(Math.abs(rightH - leftH) > 1) {
            return -1;
        }

        return Math.max(leftH, rightH) + 1;
    }
}
