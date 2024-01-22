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
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        isGood(root, root.val);
        return count;
    }

    public void isGood(TreeNode root, int max){
        if(root == null){
            return;
        }

        if(root.val >= max){
            max = root.val;
            count++;
        }

        isGood(root.left, max);
        isGood(root.right, max);
    }
}