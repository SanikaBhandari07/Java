package BinaryTree;

public class B23_MinDistBetween2Nodes {
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

        public Node lca(Node root, int node1, int node2){
            if(root == null){
                return null;
            }
            if(root.data == node1 || root.data == node2){
                return root;
            }

            Node left = lca(root.left,node1,node2);
            Node right = lca(root.right,node1,node2);

            if(left == null && right == null){
                return null;
            }
            else if(left == null){
                return right;
            }
            else if(right == null){
                return left;
            }
            else{
                return root;
            }
           
        }

        public int minDist(Node root, int node){
            if(root == null){
                return -1;
            }
            if(root.data == node){
                return 0;
            }
            int left = minDist(root.left, node);
            int right = minDist(root.right, node);
            
            if(left == -1 && right == -1){
                return -1;
            }
            else if(left == -1 && right!=-1){
                return right+1;
            }
            else if(left !=-1 && right == -1){
                return left+1;
            }
            return left + right +1;
               
        }

        int min_dist_calculator(Node root, int n1, int n2){
            Node lca = lca(root,n1,n2);
            return minDist(lca, n1) + minDist(lca, n2);

        }
            
    }
    

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);

        int dist = b.min_dist_calculator(root, 7, 1);
        System.out.println("Min dist between 2 nodes "+dist);

    }
}
