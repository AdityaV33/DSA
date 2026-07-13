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
    public int goodNodes(TreeNode root) {
        return countNodes(root , Integer.MIN_VALUE );
        
    }
    private int countNodes(TreeNode node, int maxSoFar){
        if(node == null) return  0;
    
    int count = 0;
    //Check if the current node is a good node
    if (node.val>=maxSoFar){
        count =1; //current node is a good node
        maxSoFar = node.val;
    }

    count +=countNodes(node.left,maxSoFar);
    count +=countNodes(node.right,maxSoFar);

    return count ;
}
}