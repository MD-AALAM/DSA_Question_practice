class Node {
    int val;
    Node left, right;
    Node(int item) {
        val = item;
        left = right = null;
    }
}
public class Tree_Diameter {
    static int Height(Node root) {
        if(root==null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }
    static int Diameter(Node root) {
        if(root==null){
            return 0;
        }
        int leftDiameter = Diameter(root.left);
        int rightDiameter = Diameter(root.right);
        int currDiam = Height(root.left) + Height(root.right);

        return Math.max(currDiam,Math.max(leftDiameter, rightDiameter));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of the given binary tree is : " + Diameter(root));
    }
}