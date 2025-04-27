package BinaryTree;

public class B22_KthLevelOfTree {
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
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void kthLevel(Node root, int i, int k){
            if(root == null || i>k){
                return;
            }
            if(i==k){
                System.out.print(root.data+" ");
            }
            else{
                kthLevel(root.left, i+1, k);
                kthLevel(root.right, i+1, k);
            }
        }

    }
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);
        b.kthLevel(root, 1, 3);
    }
}
