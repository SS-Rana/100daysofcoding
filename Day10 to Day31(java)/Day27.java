import java.util.*;

public class Day27 {

    static class BinaryTree {

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

        private Node root;

        
        private Node insert(Node root, int value) {
            if (root == null) {
                return new Node(value); 
            }

            if (value < root.data) {
                root.left = insert(root.left, value); 
            } else {
                root.right = insert(root.right, value); 
            }
            return root;
        }


        public void insert(int value) {
            root = insert(root, value);
        }


        public void levelOrder() {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); 

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println(); 
                    if (q.isEmpty()) {
                        break; 
                    } else {
                        q.add(null); 
                    }
                } else {
                    System.out.print(currNode.data + "\t");

                    if (currNode.left != null) {
                        q.add(currNode.left); 
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public Node getRoot() {
            return root;
        }

        public int numOfNodes(Node root) {
            if(root == null){
                return 0;
            }
            int leftNum = numOfNodes(root.left);
            int rightNum = numOfNodes(root.right);

            return leftNum + rightNum + 1;
        }
        public int numOfNodes(){
            return numOfNodes(root);
        }

        public int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }
        public int sumOfNodes(){
            return sumOfNodes(root);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
     
        bt.insert(45);
        bt.insert(85);
        bt.insert(69);
        bt.insert(36);
        bt.insert(45); 
        bt.insert(85);
        bt.insert(69);
        bt.insert(45);
        bt.insert(15);

       
        bt.levelOrder();
        System.out.println("The number of nodes in tree is "+bt.numOfNodes());
        System.out.println("The sum of data of nodes in tree is "+bt.sumOfNodes());


    }
}
