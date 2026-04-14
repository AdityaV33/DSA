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
    int maxd = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null ) return 0 ; 
        height(root );
        return maxd;
        
    }
    int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height (root.right);
        int cd = left + right;
        maxd = Math.max(maxd,cd);
        return 1+Math.max(left,right);
    }
}