package BinarySearchTree;

import java.util.ArrayList;

public class B05_Root_To_Leaf_Path{

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

    static class Binary_Search_Tree{
        public Node insert(Node root, int val){
            if(root == null){
                return new Node(val);
            }
            if(val < root.data){
                root.left = insert(root.left, val);
            }
            else{
                root.right = insert(root.right, val);
            }
            return root;
        }

        public boolean search(Node root, int val){
            if(root == null){
                return false;
            }
            if(root.data == val){
                return true;
            }
            if(val < root.data){
                return search(root.left, val);
            }
            else {
                return search(root.right, val);
            }
        }

        public void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }

        public Node deleteNode(Node root, int val){
            if(root == null){
                return null;
            }
            
            if(val < root.data){
                deleteNode(root.left, val);
            }
            if(val > root.data){
                deleteNode(root.right, val);
            }
            else{
                if(root.left == null && root.right == null){
                    return null;
                }
                if(root.left == null){
                    return root.right;
                }
                if(root.right == null){
                    return root.left;
                }
                Node ins = inorderAncestor(root.right);
                root.data = ins.data;
                root.right = deleteNode(root.right, ins.data);
            }
            return root;
        }

        public Node inorderAncestor(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }

        public void printInRange(Node root, int n1, int n2){
            if(root == null){
                return;
            }
            if(root.data >= n1 && root.data <= n2){
                printInRange(root.left, n1, n2);
                System.out.print(root.data+" ");
                printInRange(root.right, n1, n2);
            }
            else if(root.data > n2){
                printInRange(root.left, n1, n2);
            }
            else if(root.data < n1){
                printInRange(root.right, n1, n2);
            }
        }

        public void root_to_leaf_path(Node root, ArrayList <Integer> arr){
            if(root == null){
                return;
            }
            arr.add(root.data);
            if(root.left == null && root.right == null){
                print(arr);
            }
            root_to_leaf_path(root.left, arr);
            root_to_leaf_path(root.right, arr);
            arr.remove(arr.size()-1);
        }

        public void print(ArrayList <Integer> arr){
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i) +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Binary_Search_Tree b = new Binary_Search_Tree();
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i=0; i<arr.length; i++){
           root =  b.insert(root, arr[i]);
        }
        b.inOrder(root);
        System.out.println();

        System.out.println(b.search(root, 7));

        b.deleteNode(root, 5);
        b.inOrder(root);
        System.out.println();

        b.printInRange(root, 5, 13);
        System.out.println();

        ArrayList <Integer> arr1 = new ArrayList<>();
        b.root_to_leaf_path(root, arr1);


    }
}