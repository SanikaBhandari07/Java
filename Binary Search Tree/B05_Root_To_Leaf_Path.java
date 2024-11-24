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

        public void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
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

        ArrayList <Integer> arr1 = new ArrayList<>();
        b.root_to_leaf_path(root, arr1);


    }
}
