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

public class PostorderTraversal {

    static void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        postorder(root.left, res);  
        postorder(root.right, res); 
        res.add(root.val);          
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> res = new ArrayList<>();
        postorder(root, res);

        System.out.println("Postorder Traversal:");
        System.out.println(res);
    }
}