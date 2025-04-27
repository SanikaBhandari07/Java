package BinaryTree;

public class B06_CountNoOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static class Binary_Tree{
        int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int lc = countNodes(root.left);
            int rc = countNodes(root.right);
            return 1+lc+rc;
        }
    }
    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);
        System.out.println("Count of the tree Nodes is : "+b.countNodes(root));
    }
}
