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
    public void inorder(Node root) {
    	if(root == null) {
    		return;
    	}
    	inorder(root.left);
    	System.out.print(root.data+" ");
    	inorder(root.right);
    	
    }
    public void postorder(Node root) {
    	if(root == null) {
    		return;
    	}
    	postorder(root.left);
    	postorder(root.right);
    	System.out.print(root.data+" ");
    	
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] treeArray = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = bt.createTree(treeArray);
        System.out.print("Preorder traversal:");
        bt.preorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        bt.inorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        bt.postorder(root);
        System.out.println();
    }
}
