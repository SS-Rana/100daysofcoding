
public class Day28 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   
    private static int index = -1;

    public static Node createTree(int[] tree) {
        index = -1; 
        return createTreeHelper(tree);
    }

    private static Node createTreeHelper(int[] tree) {
        index++;
        if (index >= tree.length || tree[index] == -1) {
            return null; 
        }
        
        Node node = new Node(tree[index]);
        node.left = createTreeHelper(tree);
        node.right = createTreeHelper(tree);
        return node;
    }

   public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lefth = height(root.left);
        int righth = height(root.right);

        return Math.max(lefth,righth) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftD = diameter(root.left);
        int rightD = diameter(root.right);
        int rootD = height(root.left) + height(root.right) +1;

        return Math.max(leftD, Math.max(rightD, rootD));

    }
    public static boolean isSame(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }

        return root.data == subRoot.data 
            && isSame(root.left, subRoot.left) 
            && isSame(root.right, subRoot.right);

        
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isSame(root, subRoot);
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        int[] tree = {1, 2, 3, -1, -1, 4, 5};
        Node root = createTree(tree);

        int[] subtreeArray = {3, -1, -1};
        Node subRoot = createTree(subtreeArray);

        System.out.print("Inorder traversal of the main tree: ");
        inorder(root);
        System.out.println();

        System.out.print("Inorder traversal of the subtree: ");
        inorder(subRoot);
        System.out.println();

        System.out.println("Is the subtree present in the main tree? " + isSubtree(root, subRoot));
        
    }
}
