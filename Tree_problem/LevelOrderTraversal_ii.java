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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelval = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.removeFirst();
                levelval.add(curNode.val);

                if (curNode.left != null) {
                    queue.add(curNode.left);
                }

                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }

            ans.add(levelval);
        }

        Collections.reverse(ans);
        return ans;
    }
}

public class LevelOrderTraversal_ii {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrderBottom(root);

        System.out.println("Bottom-Up Level Order Traversal:");
        System.out.println(result);
    }
}