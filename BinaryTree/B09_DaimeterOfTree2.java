package BinaryTree;

public class B09_DaimeterOfTree2 {
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
        public Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }


        static class Info{
            int dia;
            int ht;
            Info(int dia, int ht){
                this.dia = dia;
                this.ht = ht;
            }
        }
        
        public Info diameter(Node root){
            if(root == null){
                return new Info(0,0);
            }

            Info left_info = diameter(root.left);
            Info right_info = diameter(root.right);
 
            int dia = Math.max(Math.max(left_info.dia,right_info.dia),left_info.ht + right_info.ht + 1);
            int ht =  1 + Math.max(left_info.ht , right_info.ht);
            return new Info(dia, ht);
        }
    }

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildtree(nodes);
        System.out.println("The root of the tree is : "+root.data);

        int diam = b.diameter(root).dia;
        System.out.println("Diameter of the tree is : "+diam);
    }
}
