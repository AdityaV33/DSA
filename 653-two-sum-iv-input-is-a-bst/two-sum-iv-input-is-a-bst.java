class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> asc = new Stack<>();
        Stack<TreeNode> desc = new Stack<>();

        TreeNode t = root;

        // Ascending iterator: smallest first
        while (t != null) {
            asc.push(t);
            t = t.left;
        }

        t = root;

        // Descending iterator: largest first
        while (t != null) {
            desc.push(t);
            t = t.right;
        }

        TreeNode small = getSmall(asc);
        TreeNode big = getBig(desc);

        while (small != big && small.val < big.val) {
            int sum = small.val + big.val;

            if (sum == k) {
                return true;
            } else if (sum < k) {
                small = getSmall(asc);
            } else {
                big = getBig(desc);
            }
        }

        return false;
    }

    TreeNode getSmall(Stack<TreeNode> asc) {
        if (asc.isEmpty()) {
            return null;
        }

        TreeNode small = asc.pop();
        TreeNode t = small.right;

        while (t != null) {
            asc.push(t);
            t = t.left;
        }

        return small;
    }

    TreeNode getBig(Stack<TreeNode> desc) {
        if (desc.isEmpty()) {
            return null;
        }

        TreeNode big = desc.pop();
        TreeNode t = big.left;

        while (t != null) {
            desc.push(t);
            t = t.right;
        }

        return big;
    }
}