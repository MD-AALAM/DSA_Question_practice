class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class IdenticalTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // Case 2: one is null or values are different
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Case 3: check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        // Tree 1
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Tree 2
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        IdenticalTree sol = new IdenticalTree();
        System.out.println(sol.isSameTree(p, q)); // true
    }
}
