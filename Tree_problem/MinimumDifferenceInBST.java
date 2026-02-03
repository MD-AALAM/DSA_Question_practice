import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class MinimumDifferenceInBST {

    static void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }

    public static int minDiffInBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);

        int ans = Integer.MAX_VALUE;
        int prev = res.get(0);

        for (int i = 1; i < res.size(); i++) {
            ans = Math.min(ans, res.get(i) - prev);
            prev = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int result = minDiffInBST(root);

        System.out.println("Minimum Difference in BST:");
        System.out.println(result);
    }
}
