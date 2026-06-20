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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 17.8 - 33 - 37(fixed stackoverflow) = 29 minutes.
        // firstly didn't have a lear solution for implementing the visualization in my head.
        // decided to set up main elements in editor 
        // after establishing elements like final result, queue ,while cycle, figured that 
        // have to apply recursion and dont know where 
        // decided pronounce all the logic again and implemented in separate array
        // then found what shoud be automated in the recursion method and figured out parameters for the method 
        // After implementation was completed I had stackoverflow error because I didn't implement base return method in the recursion function. 
        //Overall time 29 minutes, 4 minutes for bugs 
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int queueLength = 1;
        bfs(result, queue, queueLength);
        return result;
    }

    void bfs(List<List<Integer>> result, Queue<TreeNode> queue, int queueLength) {
        if(queue.size() == 0) {
            return;
        }
        List<Integer> levelNodes = new ArrayList<>();
        while (queueLength > 0) {
            TreeNode node = queue.poll();
            levelNodes.add(node.val);
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
            queueLength--;
        }
        result.add(levelNodes);
        queueLength = queue.size();

        bfs(result, queue, queueLength);
    }
}
