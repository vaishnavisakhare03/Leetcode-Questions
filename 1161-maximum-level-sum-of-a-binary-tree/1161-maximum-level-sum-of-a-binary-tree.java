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

class Solution{
    public int maxLevelSum(TreeNode root){
        Map<Integer, Integer> map = new HashMap<>();
        int level = 0;        
        int max = Integer.MIN_VALUE;

        helper(root, 1, map);

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(max < e.getValue()){
                level = e.getKey();
                max = e.getValue();
            }
        }

        return level;
    }

    public void helper(TreeNode root, int level, Map<Integer, Integer> map){
        if(root == null) return;

        int sum = map.getOrDefault(level, 0) + root.val;
        map.put(level, sum);

        helper(root.left, level+1, map);
        helper(root.right, level+1, map);
    }
}