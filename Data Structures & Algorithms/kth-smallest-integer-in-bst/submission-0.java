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
    public int kthSmallest(TreeNode root, int k) {
        // spent 25 minutes - watched some anime videos in parallel and read info about some characters 
        List<Integer> resL = new ArrayList<>();

        traverse(root, resL, k);
        if(resL.size() < k) {
            return -1;
        }
        return resL.get(k - 1);
    }

    void traverse(TreeNode root, List<Integer> list, int k) {
        if(root == null) {
            return;
        }
        traverse(root.left, list, k);
        list.add(root.val);
        traverse(root.right, list, k);

    }
}
