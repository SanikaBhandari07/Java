package BinaryTree;

public class B11_MaxSumFromRootToLeaf {
    
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
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public int max_sum_from_root_to_leaf(Node root){
            if(root == null){
                return 0;
            }
            int lsum = max_sum_from_root_to_leaf(root.left);
            int rsum =max_sum_from_root_to_leaf(root.right);
            return Math.max(lsum,rsum)+root.data;
        }
    }

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, 8, -1, 2, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("The root of the tree is : "+root.data);

        int maxsum = b.max_sum_from_root_to_leaf(root);
        System.out.println("The maximum sum of height : "+maxsum);
    }
}
