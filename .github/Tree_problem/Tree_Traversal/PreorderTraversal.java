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

public class PreorderTraversal {

    static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.val);        // Root
        preorder(root.left, res); // Left
        preorder(root.right, res);// Right
    }

    public static void main(String[] args) {

        // Creating the tree
        //       1
        //        \
        //         2
        //        /
        //       3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> res = new ArrayList<>();
        preorder(root, res);

        System.out.println("Preorder Traversal:");
        System.out.println(res);
    }
}
