class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // 1. Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // 2. Only one node is null
        if (p == null || q == null) {
            return false;
        }

        // 3. Node values are different
        if (p.val != q.val) {
            return false;
        }

        // 4. Check left and right subtrees
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return left && right;
    }
}