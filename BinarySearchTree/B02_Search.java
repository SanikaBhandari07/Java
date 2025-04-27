package BinarySearchTree;

public class B02_Search {
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

    public static Node insertNode(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            root.left = insertNode(root.left, val);
        }
        if(val > root.data){
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static boolean searchNode(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return searchNode(root.left, key);
        }
        else{
            return searchNode(root.right, key);
        }
    }




    public static void main(String args[]){
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<arr.length; i++){
            root = insertNode(root,arr[i]);
        }

        inorder(root);

        System.out.println();

        if(searchNode(root, 6)){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
