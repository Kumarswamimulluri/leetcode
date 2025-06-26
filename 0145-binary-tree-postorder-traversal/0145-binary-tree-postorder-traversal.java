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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        PostOrder(root,res);
        return res;
    }
    private void PostOrder(TreeNode node, List<Integer> res){
        if(node == null) return;

        PostOrder(node.left,res);
        PostOrder(node.right,res);
        res.add(node.val);
    }
}