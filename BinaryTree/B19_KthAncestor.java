package BinaryTree;

public class B19_KthAncestor {

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

        int kth_Ancestir(Node root, int n, int k){

            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }

            int left = kth_Ancestir(root.left, n, k);
            int right = kth_Ancestir(root.right, n, k);

            if(left == -1 && right == -1){
                return -1;
            }
            else{
                int max = Math.max(left,right);
                if(max+1 == k){
                    System.out.println("Kth Ancestor is : "+root.data);
                }
                return max+1;
            }
        }
    }
    
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);
        int s = b.kth_Ancestir(root, 8, 1);
        System.out.println(s);
    }
}
