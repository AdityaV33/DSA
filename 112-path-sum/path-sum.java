class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root, 0, targetSum);
    }

    boolean fun(TreeNode root, int sum, int target) {
        if (root == null) {
            return false;
        }

        sum += root.val;

        if (root.left == null && root.right == null) {
            return sum == target;
        }

        return fun(root.left, sum, target)
            || fun(root.right, sum, target);
    }
}
