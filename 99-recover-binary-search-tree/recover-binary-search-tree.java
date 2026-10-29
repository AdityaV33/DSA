class Solution {
    TreeNode prev = null;
    TreeNode g1_first = null;
    TreeNode g1_second = null;

    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp = g1_first.val;
        g1_first.val = g1_second.val;
        g1_second.val = temp;
    }

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev != null && root.val < prev.val) {
            if (g1_first == null) {
                g1_first = prev;
            }

            g1_second = root;
        }

        prev = root;

        inorder(root.right);
    }
}