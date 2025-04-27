package BinaryTree;

public class B08_DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary_Tree{
        int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return 1 + Math.max(lh,rh);
        }

        public int diameter(Node root){
            if(root == null){
                return 0;
            }
            int self = height(root.left) + height(root.right) + 1;
            int ld = diameter(root.left);
            int rd = diameter(root.right);

            return Math.max(Math.max(ld,rd),self);
        }
    }

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("The root of the tree is : "+root);

        int dia = b. diameter(root);
        System.out.println("The diameter of the tree is : "+dia);
    }
}
