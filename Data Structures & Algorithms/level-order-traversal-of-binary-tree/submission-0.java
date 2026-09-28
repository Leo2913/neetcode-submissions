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
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)    return res;
        while(!q.isEmpty()){
            List<Integer> layer = new LinkedList<>();
            for(int i = q.size(); i > 0; i--){
                TreeNode t = q.poll();
                if(!(t.left == null))   q.add(t.left);
                if(!(t.right == null))   q.add(t.right); 
                layer.add(t.val);
            }
            res.add(layer);
        }
        return res;
    }
}
