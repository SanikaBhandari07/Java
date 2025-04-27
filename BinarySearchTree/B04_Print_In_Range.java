package BinarySearchTree;

public class B04_Print_In_Range {
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
        else if(val > root.data){
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static Node deleteNode(Node root, int val){
        if(root == null){
            return null;
        }

        if(val < root.data){
            root.left = deleteNode(root.left, val);
        }
        else if(val > root.data){
            root.right = deleteNode(root.right, val);
        }
        else{
            // 0 child
            if(root.left == null && root.right == null){
                return null;
            }
            //1 child
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // 2 child
            else{
                Node inS = inOrderSuccessor(root.right);
                root.data = inS.data;
                root.right = deleteNode(root.right, val);
            }

        }
        return root;

    }

    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int n1, int n2){
        if(root == null){
            return;
        }
        if(root.data >=n1 && root.data <=n2){
            printInRange(root.left, n1, n2);
            System.out.print(root.data +" ");
            printInRange(root.right, n1, n2);
        }
        else if(root.data < n1){
            printInRange(root.right, n1, n2);
        }
        else if(root.data > n2){
            printInRange(root.left, n1, n2);
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<arr.length; i++){
           root =  insertNode(root,arr[i]);
        }
        inOrder(root);
        System.out.println();

        deleteNode(root, 6);
        inOrder(root);

        System.out.println();
        printInRange(root,5,12);
    }
}
