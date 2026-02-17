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

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        } 
        else if (root.val < val) {
            return searchBST(root.right, val);
        } 
        else {
            return searchBST(root.left, val);
        }
    }
}

public class SearchInBST {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution sol = new Solution();

        int target = 2;
        TreeNode result = sol.searchBST(root, target);

        if (result != null) {
            System.out.println("Value found: " + result.val);
        } else {
            System.out.println("Value not found");
        }
    }
}