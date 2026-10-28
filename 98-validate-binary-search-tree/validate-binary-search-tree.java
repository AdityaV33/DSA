class Solution {
    TreeNode prev = null;
    boolean ans = true;

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return ans;
    }

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev == null) {
            prev = root;
        } else {
            if (root.val <= prev.val) {
                ans = false;
            }
            prev = root;
        }

        inorder(root.right);
    }
}