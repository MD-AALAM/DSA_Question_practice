import java.util.*;

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

    static void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        inOrder(root, res);

        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) >= res.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);

        Solution sol = new Solution();
        boolean result = sol.isValidBST(root);

        if (result) {
            System.out.println("The tree is a Valid BST.");
        } else {
            System.out.println("The tree is NOT a Valid BST.");
        }
    }
}