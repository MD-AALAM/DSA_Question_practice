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

public class InorderTraversal {

    static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        inorder(root.left, res);  
        res.add(root.val);         
        inorder(root.right, res);  
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> res = new ArrayList<>();
        inorder(root, res);

        System.out.println("Inorder Traversal:");
        System.out.println(res);
    }
}
