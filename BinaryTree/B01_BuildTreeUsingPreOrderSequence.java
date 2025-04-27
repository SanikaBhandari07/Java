package BinaryTree;

public class B01_BuildTreeUsingPreOrderSequence {
    
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
        public Node buildTreeUsingPreOrderSequeence(int Nodes[]){
            idx++;
            if(Nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTreeUsingPreOrderSequeence(Nodes);
            newNode.right = buildTreeUsingPreOrderSequeence(Nodes);
            return newNode;
        }
    }


    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildTreeUsingPreOrderSequeence(nodes);
        System.out.println("This is the PreOrder Sequence");
        System.out.println("Root of the tree is "+root.data);
    }
}
