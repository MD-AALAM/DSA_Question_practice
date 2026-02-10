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

    public static boolean isIdentical(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val != subRoot.val) {
            return false;
        }

        return isIdentical(root.left, subRoot.left) &&
               isIdentical(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
}

public class SubTreeOfAnotherTree {
    public static void main(String[] args) {

        // Main Tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Sub Tree
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        Solution sol = new Solution();
        System.out.println("Is Subtree: " + sol.isSubtree(root, subRoot));
    }
}
