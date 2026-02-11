import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {

    boolean isLeaf(Node root){
        return (root.left == null && root.right == null);
    }

    void LeftBoundary(Node root, ArrayList<Integer> res){
        while(root != null){
            if(!isLeaf(root)){
                res.add(root.data);
            }
            if(root.left != null){
                root = root.left;
            } else {
                root = root.right;
            }
        }
    }

    void LeafNode(Node root, ArrayList<Integer> res){
        if(root == null){
            return;
        }

        if(isLeaf(root)){
            res.add(root.data);
            return;
        }

        LeafNode(root.left, res);
        LeafNode(root.right, res);
    }

    void ReverseRightBoundary(Node root, ArrayList<Integer> res){
        Stack<Integer> st = new Stack<>();

        while(root != null){
            if(!isLeaf(root)){
                st.push(root.data);
            }
            if(root.right != null){
                root = root.right;
            } else {
                root = root.left;
            }
        }

        while(!st.isEmpty()){
            res.add(st.pop());
        }
    }

    ArrayList<Integer> boundaryTraversal(Node root) {

        ArrayList<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        if(!isLeaf(root)){
            res.add(root.data);
        }

        LeftBoundary(root.left, res);
        LeafNode(root, res);
        ReverseRightBoundary(root.right, res);

        return res;
    }
}

public class BoundaryTraversalDemo {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        Solution sol = new Solution();

        ArrayList<Integer> result = sol.boundaryTraversal(root);

        System.out.println("Boundary Traversal:");
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
