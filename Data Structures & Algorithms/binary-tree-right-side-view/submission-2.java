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
    public List<Integer> rightSideView(TreeNode root) {
        // 52 8 implementation 10 syntax 12 Total: 21 minutes
        //error fixing: didn't implemet validation for null leafs "node.left != nul"
        //didn't provide solution for the corner case "if(root == null) { return new ArrayList<>(); }"
        // decided to apply logic where I can found levels and then get last element from each level
        // because the solution was obvious I felt excitment and was focused a little bit on that feeling rather then on corner cases 
        // which lead to error after submit stage, I highly sopouse 
        // I shell to pronounce corner cases in the begginig, maybe it will help


        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        bfs(queue, 1, result);
        return result;
    }

    void bfs(Queue<TreeNode> queue, int size, List<Integer> result) {
        if(queue.size() == 0) {
            return;
        }

        while(size > 0) {
            TreeNode node = queue.poll();

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }

            if(size == 1) {
                result.add(node.val);
            } 
            size--;
        }

        size = queue.size();
        bfs(queue, size, result);
    }
}
