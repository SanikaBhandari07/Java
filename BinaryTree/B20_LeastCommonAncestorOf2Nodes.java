package BinaryTree;

import java.util.HashSet;

public class B20_LeastCommonAncestorOf2Nodes {
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
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        static int p = -1;
        
        public int findNode(Node root, int node2,HashSet<Integer> hs){
            if(root == null){
                return -1;
            }
            if(root.data == node2){
                return 0;
            }
            int left = findNode(root.left, node2, hs);
            int right = findNode(root.right, node2, hs);
            

            if(left == -1 && right ==-1){
                return -1;
            }
            else{
                
                    if(!hs.contains(root.data)){
                        hs.add(root.data);
                    }
                    else{
                        if(p==-1){
                            p=root.data;
                            System.out.print("LCA is "+root.data);
                        }
                        
                    }
                
                return 0;
            }

        }
        void lca(Node root, int node1, int node2){
            HashSet <Integer> hs = new HashSet<>();
            findNode(root, node1,hs);
            findNode(root, node2,hs);

        }
    }
    public static void main(String[] args) {
            BinaryTree b = new BinaryTree();
            int nodes [] = {1, 2 ,  4  ,-1 ,-1, 5,  -1, 8, -1, -1,  3, 6, -1, -1,  7, -1,-1};
            Node root = b.buildTree(nodes);
            System.out.println("Root of the tree is : "+root.data);
            b.lca(root, 5, 8);
            
    }
    
}
