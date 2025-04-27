package BinaryTree;

public class B21_Least_Commom_Ancestor2 {
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
    }

    public static void main(String args[]){
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, 10,11,12,-1,-1,-1,-1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);

        Node lca = b.lca(root,4,100);
        if(lca!=null){
            System.out.println("LCA of tree is : "+lca.data);
        }
        else{
            System.out.println("No node exist");
        }

    }
}

// both the roots are not present then : No node exist
//else it will written first existih
