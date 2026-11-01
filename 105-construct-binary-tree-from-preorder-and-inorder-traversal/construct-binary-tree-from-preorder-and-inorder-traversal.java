class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int idx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        idx = 0;
        return fun(preorder, 0, inorder.length - 1);
    }

    TreeNode fun(int[] preorder, int low, int high) {

        // Base case
        if (low > high) {
            return null;
        }

        // Create root using preorder
        TreeNode node = new TreeNode(preorder[idx]);
        idx++;

        // Find root's position in inorder
        int id = map.get(node.val);

        // Build left subtree
        node.left = fun(preorder, low, id - 1);

        // Build right subtree
        node.right = fun(preorder, id + 1, high);

        return node;
    }
}