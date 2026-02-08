class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftN = height(root.left);
        int rightN = height(root.right);

        if (Math.abs(leftN - rightN) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}

public class BalancedBinaryTree {
    public static void main(String[] args) {

        // Balanced Tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        boolean result = sol.isBalanced(root);

        System.out.println("Is tree balanced? " + result);
    }
}
