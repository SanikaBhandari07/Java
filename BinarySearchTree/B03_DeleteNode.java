package BinarySearchTree;

public class B03_DeleteNode {
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

    public static Node insertNode (Node root, int val){
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

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node deleteNode(Node root, int val){
        if(root == null){
            return null;
        }
        
        if(val < root.data){
            root.left = deleteNode(root.left, val);
        }
        else if( val > root.data){
            root.right = deleteNode(root.right, val);
        }
        else{
            //0 child
            if(root.left == null && root.right == null){
                return null;
            }
            //1 child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            // 2 child
            else{
                Node inas = inorderAncestor(root.right);
                root.data = inas.data;
                root.right = deleteNode(root.right, inas.data);
            }
        }
        return root;
    }

    public static Node inorderAncestor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]){
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<arr.length; i++){
            root = insertNode(root, arr[i]);
        }

        inOrder(root);
        System.out.println();

        deleteNode(root, 3);
        inOrder(root);
    }
}
