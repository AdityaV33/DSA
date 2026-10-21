class Solution {
    int res = 0;

    public int sumNumbers(TreeNode root) {
        fun(root, 0);
        return res;
    }

    void fun(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) {
            res += sum;
            return;
        }

        fun(root.left, sum);
        fun(root.right, sum);
    }
}