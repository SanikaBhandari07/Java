package BinaryTree;

public class B23_MinDistBetweenTwoNodes {
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
        boolean flag = false;
        static int c = 0;
        int min_dist_calculator(Node root, int n1, int n2){
            if(root == null){
                return 0;
            }
            if(root.data == n1 || root.data == n2){
                return 1;
            }
            int left = min_dist_calculator(root.left, n1, n2);
            int right = min_dist_calculator(root.right, n1, n2);
            
            if(flag == false){
                if(left > 0  && right > 0){
                    flag = true;
                    c = left + right + 1;
                    return left + right +1;
                }
                if(left == 0  && right == 0){
                    return 0;
                }
                else if(left == 0){
                    return right + 1;
                }
                else if(right == 0){
                    return left + 1;
                }
                return left + right +1;
            }
            
            return c;

        }
            
    }
    

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);

        int dist = b.min_dist_calculator(root, 8,1)-1;
        System.out.println("Min dist between 2 nodes "+dist);

    }
}
