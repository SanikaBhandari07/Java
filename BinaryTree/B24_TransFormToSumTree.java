package BinaryTree;

public class B24_TransFormToSumTree {
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
            idx ++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public int transForm(Node root){
            if(root == null ){
                return 0;
            }
            int left = transForm(root.left);
            int right = transForm(root.right);

            int data = root.data;
            root.data = left + right;
            return root.data + data;
        }



    }

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);

        int root2 = b.transForm(root);
        System.out.println("Sum of tree :"+root2);


    }
}
