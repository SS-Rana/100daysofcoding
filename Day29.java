public class Day29 {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public class BinarySearchTree {
        Node root;

        BinarySearchTree() {
            root = null;
            System.err.println("Binary Search Tree is initialized");
        }

        public void insert(int[] arr) {
            for (int value : arr) {
                root = insertRec(root, value);
            }
        }

        private Node insertRec(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            }
            if (value < root.data) {
                root.left = insertRec(root.left, value);
            } else if (value > root.data) {
                root.right = insertRec(root.right, value);
            }
            return root;
        }

        public void inorderTraversal() {
            inorderRec(root);
            System.out.println(); 
        }

        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }

        private void Search(Node root,int data){
            if(root == null){
                System.err.println(data+ " not found in tree");
                return;
            }
            if(root.data > data){
                Search(root.left,data);
            }
            if(root.data < data){
                Search(root.right,data);
            }
            if(root.data == data){
                System.out.println(data + "is present in the tree");
                return;
            }
        }

        public void search(int data){
            Search(root,data);
        }
        private Node minNode(Node root){
            Node t = root;
            while(t.left != null){
                t = t.left;
            }
            return t;
        }
        private Node delete(Node root, int data){
            if(root == null){
               System.err.println(data + " not found in tree");
               return null;
            }
            if(data < root.data){
                root.left = delete(root.left, data);
            }
            else if(data > root.data){
                root.right = delete(root.right, data);
            }
            else{
                if(root.left == null && root.right == null){
                    return null;
                }

                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }

                else{
                    Node t = minNode(root.right);
                    root.data = t.data;
                    root.right = delete(root.right, t.data);
                }
            }
            return root;
        }

        public void delete(int data){
            root = delete(root,data);
        }
       
    }

    public static void main(String[] args) {
        Day29 day29 = new Day29();
        BinarySearchTree bst = day29.new BinarySearchTree();

        int[] arr = {50, 30, 20, 40, 70, 60, 80};
        bst.insert(arr);

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal();

        bst.search(40);
        bst.search(45);

        bst.delete(40);

        System.out.println("Inorder traversal of the BST after deletion:");
        bst.inorderTraversal();
    }
}
