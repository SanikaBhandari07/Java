package BinaryTree;
import java.util.*;
public class B04_LevelOrderTraversal {
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
            newNode.right =buildTree(nodes);
            return  newNode;
        }

        public void levelOrderTraversal(Node root){
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node top = q.remove();
                
                if(top == null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        System.out.println();
                        q.add(null);
                    }
                    
                }
                else{
                    System.out.print(top.data+" ");
                    if(top.left != null ){
                        q.add(top.left);
                    }
                    if(top.right != null ){
                        q.add(top.right);
                    }
                    
                }
                
            }
        }
    }

     

    public static void main(String[] args) {
        Binary_Tree b = new Binary_Tree();
        int nodes [] = {1 , 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);
        b.levelOrderTraversal(root);
    }
}
