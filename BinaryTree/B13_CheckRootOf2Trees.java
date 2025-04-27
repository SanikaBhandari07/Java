package BinaryTree;

public class B13_CheckRootOf2Trees {
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
        public boolean isIdentical(Node root1, Node root2){
            if(root1==null){
                return false;
            }
            if(root1.data == root2.data){
                return true;
            }
            return isIdentical(root1.left, root2) ||  isIdentical(root1.right, root2);

        }
    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(6);

        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5);

        System.out.println(b.isIdentical(root1,root2));

    }
}
