package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class B16_BottomView {
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
            int hd;
            Node root;
            Info(int hd,Node root){
                this.hd = hd;
                this.root = root;
            }
        }

        public void topView(Node root){
            Queue <Info> q = new LinkedList<>();
            HashMap <Integer,Node> hm = new HashMap<>();
            q.add(new Info(0,root));
            q.add(null);

            int min = 0;
            int max =0;

            while(!q.isEmpty()){
                Info top = q.remove();

                if(top== null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }

                else{
                    
                    hm.put(top.hd, top.root);  //only one change
                    
    
                    if(top.root.left != null){
                        q.add(new Info(top.hd-1, top.root.left));
                        min = Math.min(min,top.hd-1);
                    }
                    if(top.root.right != null){
                        q.add(new Info(top.hd +1, top.root.right));
                        max = Math.max(max, top.hd+1);
                    }
                }
                
                

            }

            for(int i=min; i<=max; i++){
                System.out.println(hm.get(i).data);
            }

        }
    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1, -1};
        Node root = b.buildTree(nodes);
        System.out.println("Root of the tree is : "+root.data);
        b.topView(root);
    }
}
