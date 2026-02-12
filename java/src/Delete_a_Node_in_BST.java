package src;
import java.util.*;
public class Delete_a_Node_in_BST {static class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value) {
            // left subtree
            root.left = insert(root.left, value);
        } else {
            // right subtree
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static Node delete(Node root, int val){
    if(root == null){
        return null;
    }
    if(root.data < val){
        root.right = delete(root.right, val);
    }else if(root.data > val){
        root.left = delete(root.left, val);
    }
    else{
        //case 1 no child leaf node
        if(root.left == null && root.right == null){
            return null;
        }
        //case 2 single child
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.right;
        }

        //case 3; both child are present
        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right, IS.data);

    }
    return root;
    }
    public static Node findInorderSuccessor(Node root){
    while(root.left != null){
        root = root.left;
    }
    return root;
    }
    public static void printInRange(Node root, int k1, int k2){
    if(root == null){
        return ;
    }
    if(root.data >= k1 && root.data <= k2){
        printInRange(root.left, k1,k2);
        System.out.print(root.data + " ");
        printInRange(root.right, k1, k2);
    }
    else if(root.data <k1) {
        printInRange(root.right, k1, k2);
    }
    else{
        printInRange(root.left, k1, k2);
    }
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
//        System.out.println();
//        root = delete(root, 1);
//        inorder(root);
        System.out.println();
        printInRange(root, 1, 14);


    }
}
