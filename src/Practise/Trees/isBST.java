package Practise.Trees;

class Node {
    Node left;
    Node right;
    int data;
}
public class isBST {

    public static void main(String args[]) {

    }

    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        if(root == null) {
            return true;
        }


        int rootValue = root.data;
        int left = root.left != null ? root.left.data : Integer.MIN_VALUE;
        int right = root.right != null ? root.right.data : Integer.MAX_VALUE;

        System.out.println("THe node value is "+ root.data + "  left is "+ left +  "  right is :: "+right);
        boolean currentTreeIsBst = left < rootValue && right > rootValue;

        if(currentTreeIsBst == false) {
            return false;
        }


        return isBST(root.left) && isBST(root.right);
    }
}
