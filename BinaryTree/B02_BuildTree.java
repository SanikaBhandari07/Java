package BinaryTree;

public class B02_BuildTree {
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

    static class BinaryTree{
        public Node buildTree(){
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.right.right = new Node(6);
            return root;
        }

        public Node buildetree2(){
            Node root = new Node(1);

            for(int i=0; i<8; i+=2){
                root.left = new Node(i);
                root.right = new Node(i+1);
            }
            return root;
        }
    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        System.out.println(b.buildTree().data);
        System.out.println(b.buildetree2().data);
    }
}
