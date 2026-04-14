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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> l = new ArrayList<>();
        if(root == null) return l; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true ;
        while(!q.isEmpty()){
            int n = q.size();
            
            List<Integer> in = new ArrayList<>();
            for(int i =0;i<n;i++){
                TreeNode cur = q.poll();
                in.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!= null) q.add(cur.right);

            }
            if(!flag) Collections.reverse(in);
            l.add (in);
            flag = !flag;
        }
        return l;

    }
}