import java.util.ArrayList;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val=x;
        left=null;
        right=null;
    }
}
public class Minimum_Distance_Between_BST_Node {
    public static void InOrder(TreeNode root,ArrayList<Integer> res){
        if(root==null){
            return;
        }
        InOrder(root.left,res);
        res.add(root.val);
        InOrder(root.right,res);
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        ArrayList<Integer> res = new ArrayList<>();
        InOrder(root,res);
        int ans=Integer.MAX_VALUE;
        int prev=res.get(0);

        for(int i=1;i<res.size(); i++){
            ans=Math.min(ans,res.get(i)-prev);
            prev=res.get(i);
        }
        System.out.println("Minimum distance between BST nodes: " + ans);
    }
}