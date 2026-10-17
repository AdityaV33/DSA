class Solution {
    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        find(root, p, q);
        return ans;
    }

    int find(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return 0;
        }

        int left = find(node.left, p, q);
        int right = find(node.right, p, q);

        int self = 0;
        if (node == p || node == q) {
            self = 1;
        }

        int total = left + self + right;

        if (total == 2 && ans == null) {
            ans = node;
        }

        return total;
    }
}