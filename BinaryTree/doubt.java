package BinaryTree;

public class doubt {
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

        public Node buildTree(int[] Nodes){
            idx++;
            if(Nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);
            return newNode;
        }

    }

    static class Binary_Tree2{
        static int i = -1;
        public Node builTree(int[] nodes){
            i++;
            if(i>=nodes.length || nodes[i]==-1){
                return null;
            }

            Node newNode = new Node(nodes[i]);

            newNode.left = builTree(nodes);

            newNode.right = builTree(nodes);

            return newNode;
        }

        
        public Node buildTree2(int nodes[], int i){
            if(nodes[i] == -1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree2(nodes,++i);
            System.out.println(i);
            newNode.right = buildTree2(nodes,i);
            System.out.println(i);
            return newNode;
        }


        public void PreOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data +" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }


    public static void main(String[] args) {


        // Binary_Tree b = new Binary_Tree();
        // int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
        int nodes[] = {1,2,4,-1,-1,7};
        // int nodes[] = {1,2,4,-1,-1};
        // Node root = b.buildTree(nodes);
        // System.out.println("Root of the tree is : "+root.data);

        
        Binary_Tree2 b1 = new Binary_Tree2();
        Node root1 = b1.buildTree2(nodes,0);
         System.out.println("Root of the tree is : "+root1.data);
         b1.PreOrder(root1);

    

    }
}
