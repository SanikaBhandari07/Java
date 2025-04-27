package BinaryTree;
//Find the Maximum Path Sum Between Two Leaves in a Binary Tree
public class B10_MaximumPathSum {
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

        
        static class Info{
            int ht;
            int dia;
            int dia_sum;
            Info(int ht, int dia, int dia_sum){
                this.ht = ht;
                this.dia = dia;
                this.dia_sum = dia_sum;
            }
        }

        public Info maxsum(Node root){
            if(root == null){
                return new Info(0,0,0);
            }
            Info left = maxsum(root.left);
            Info right = maxsum(root.right);

            int curr_ht = Math.max(left.ht,right.ht)+1;

            int curr_dia = Math.max(Math.max(left.dia,right.dia),(left.ht+right.ht+1));

            // int curr_dia_sum = Math.max(left.dia_sum , right.dia_sum) + root.data;

            // // return new Info(curr_ht, curr_dia,curr_dia_sum);
            // if(left.dia > right.dia){
            //     return new Info(curr_ht, curr_dia,left.dia_sum);
            // }
            // else if(left.dia < right.dia){
            //     return new Info(curr_ht, curr_dia, right.dia_sum);
            // }
            // else{
            //     return new Info(curr_ht, curr_dia,curr_dia_sum);
            // }
            int curr_dia_sum;
            if (root.left != null && root.right != null) {
                curr_dia_sum = left.dia_sum + right.dia_sum + root.data;
            } else {
                curr_dia_sum = Math.max(left.dia_sum, right.dia_sum) + root.data;
            }

            return new Info(curr_ht, curr_dia, curr_dia_sum);
        }
    }

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);

        System.out.println("Maximum sum between 2 leaf is : ");
        System.out.println(b.maxsum(root).ht+"   "+b.maxsum(root).dia + "  "+b.maxsum(root).dia_sum);
    }
}
