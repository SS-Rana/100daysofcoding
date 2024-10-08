package BinaryTree;

public class BinaryTree {
    private int idx;
    
    public BinaryTree() {
        this.idx = -1; 
    }
    
    class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public Node createTree(int[] tree) {
        idx++;
        if (idx >= tree.length || tree[idx] == -1) {
            return null;
        }
        
        Node newNode = new Node(tree[idx]);
        newNode.left = createTree(tree);
        newNode.right = createTree(tree);
        return newNode;
    }
    

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] treeArray = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = bt.createTree(treeArray);
        System.out.println("Preorder traversal:");
        bt.preorder(root);
    }
}
