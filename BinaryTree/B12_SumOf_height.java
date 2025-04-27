package BinaryTree;

public class B12_SumOf_height {
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

        static class Info{
            int ht;
            int ht_sum;
            Info(int ht,int ht_sum){
                this.ht = ht;
                this.ht_sum = ht_sum;
            }
        }

        public Info sum_of_ht(Node root){
            if(root == null){
                return new Info(0,0);
            }
            Info left = sum_of_ht(root.left);
            Info right = sum_of_ht(root.right);
            
            int curr_ht = Math.max(left.ht,right.ht)+1;
            int curr_ht_sum = Math.max(left.ht_sum,right.ht_sum)+root.data;

            if(left.ht > right.ht){
                return new Info(curr_ht, left.ht_sum + root.data);
            }
            else if(left.ht < right.ht){
                return new Info(curr_ht, right.ht_sum + root.data);
            }
            else{
                return new Info(curr_ht, curr_ht_sum);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, 8, -1, 2, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("The root of the tree is : "+root.data);
        System.out.println(b.sum_of_ht(root).ht +"   "+b.sum_of_ht(root).ht_sum);
    }
}
