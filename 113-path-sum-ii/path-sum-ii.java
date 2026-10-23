class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> diary = new ArrayList<>();
        fun(root, 0, diary, targetSum);
        return res;
    }

    void fun(TreeNode root, int sum, List<Integer> diary, int target) {
        if (root == null) {
            return;
        }

        sum += root.val;
        diary.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == target) {
                res.add(new ArrayList<>(diary));
            }

            diary.remove(diary.size() - 1);
            return;
        }

        fun(root.left, sum, diary, target);
        fun(root.right, sum, diary, target);

        diary.remove(diary.size() - 1);
    }
}