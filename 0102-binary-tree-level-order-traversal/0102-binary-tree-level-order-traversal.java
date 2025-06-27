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
        // oka res ane list lo list of node values store cheskoni return  chestham
        List<List<Integer>> res = new ArrayList<>();
        // oka vela root kani null aitthey res ni return chestham
        if(root == null) return res;

        // oka queue ni create cheskuntam treenode store cheyadaniki adhi linked list lo
        Queue<TreeNode> queue = new LinkedList<>();
        // first step vachi echina root ni offer chestha, queue ki
        queue.offer(root);

        // oka vela queue kani empty kakunda vuntey
        while(!queue.isEmpty()){
            // aa oke level lo vunna nodes size ni oka variable ni store chestham adhi
            // queue size ayyuntundhi rathi level ki maruthundhi
            int levelsize = queue.size();
            // oka list lo node value ni store chestham aa lavel varaku 
            List<Integer> currlevelval = new ArrayList<>();

            //oka loop ni iteterate chestham aa leval oka size antey enni nodea vuntayo antha
            for(int i = 0;i < levelsize;i++){
                //queue nundi poll chesi aa value ni node ane treeNode l ostore chestham 
                TreeNode node = queue.poll();
                //curr level value ane list lo add chestham node value ni
                currlevelval.add(node.val);
                // malli aa node.left kani null kakapothe dhani queueu ki offer chestha,m
                if(node.left != null) queue.offer(node.left);
                // same alage right ki kuda
                if(node.right != null) queue.offer(node.right);
            }
            // loop bayata vachaka aa level lo vunna values anni currlevelval list lo store 
            // ayyuntai so dhani ni res loki addchestham
            res.add(currlevelval);
        }
        //final ga res ni return chesthaam
        return res;
    }
}