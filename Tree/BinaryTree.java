import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class BinaryTree {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(15);
        root.right.right = new Node(40);
        // Inorder Traversal

        System.out.println("Inorder Traversal of tree is as follows :");
        inorder(root);

        // Pre Order Traversal
        System.out.println("Pre-order Traversal of tree is as follows :");
        preorder(root);

        // Post Order traversal
        System.out.println("Post-order Traversal of tree is as follows :");
        postorder(root);

    }
    // Method for inorder traversal

    public static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Method for preorder traversal
    public static void preorder(Node root) {

        if (root != null) {

            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Method for postorder traversal
    public static void postorder(Node root) {

        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");

        }
    }

}
