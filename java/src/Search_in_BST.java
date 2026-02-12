package src;

public class Search_in_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left );
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value) {
            //left subtree
            root.left = insert(root.left, value);
        }else{
            //right subtree
            root.right = insert(root.right ,value);
        }
        return root;
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true ;
        }
        if(root.data > key){
            //to return whether the key is found in the left subtree or not
            return search(root.left, key);
        }else{
            //to return whether the key is found in the right subtree or not
            return search(root.right, key);
        }

    }
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        int key =8;
        if(search(root, key)){
            System.out.println("\nkey is found in the BST");
        }else {
            System.out.println("\nkey is not found in the BST");
        }

    }
}
