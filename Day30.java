
import java.util.ArrayList;
public class Day30 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Inserts data into the BST
    public static Node insert(Node root, int data) {
        if (root == null) {
            Node newNode = new Node(data);
            return newNode;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Performs inorder traversal of the BST
    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // Computes the height of the BST
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // Computes the number of nodes in the BST
    public static int noOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return noOfNodes(root.left) + noOfNodes(root.right) + 1;
    }

    // Computes the sum of all nodes' data in the BST
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    // Computes the diameter of the BST
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftD = diameter(root.left);
        int rightD = diameter(root.right);
        int rootD = height(root.left) + height(root.right) + 1;

        return Math.max(leftD, Math.max(rightD, rootD));
    }

    // Searches for a data value in the BST
    public static boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (data < root.data) {
            return search(root.left, data);
        } else if (data > root.data) {
            return search(root.right, data);
        } else {
            return true;
        }
    }

    // Prints nodes with data in the range [x, y)
    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (x < root.data) {
            printInRange(root.left, x, y);
        }

        if (x <= root.data && root.data < y) {
            System.out.print(root.data + " ");
        }

        if (root.data < y) {
            printInRange(root.right, x, y);
        }
    }
    // Prints path
    public static void printPath(ArrayList <Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
    // Prints path from root to leaf
    public static void rootToleaf(Node root, ArrayList <Integer> path) {
        if(root == null){
            return;
        }

        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        else{
            rootToleaf(root.left, path);
            rootToleaf(root.right, path);
        }

        path.remove(path.size()-1);

    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 12);
        root = insert(root, 18);

        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
        System.out.println();

        System.out.println("Height of the tree: " + height(root));
        System.out.println("Number of nodes: " + noOfNodes(root));
        System.out.println("Sum of all nodes: " + sumOfNodes(root));
        System.out.println("Diameter of the tree: " + diameter(root));

        int searchValue = 7;
        System.out.println("Searching for " + searchValue + ": " + (search(root, searchValue) ? "Found" : "Not Found"));

        int rangeStart = 4, rangeEnd = 15;
        System.out.print("Nodes in range [" + rangeStart + ", " + rangeEnd + "): ");
        printInRange(root, rangeStart, rangeEnd);
        System.out.println();

        System.out.println("Path from root to leaf: ");
        rootToleaf(root, new ArrayList <Integer>());
        System.out.println();
    }
}
