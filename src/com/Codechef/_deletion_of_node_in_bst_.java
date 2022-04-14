package com.Codechef;
import java.util.*;

public class _deletion_of_node_in_bst_ {
    static class Node{
        int key;
        Node left, right;
        public Node(int key){
            this.key = key;
        }
    }
    public static Node delNode(Node root,int x){
        if(root==null){
            return null;
        }
        else if(root.key>x){
            root.left = delNode(root.left,x)
        }
        else if(root.key<x){
            root.right = delNode(root.right,x);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
        }
        return root;

    }
    public static Node getSucc(Node root){
        Node curr = root.right;
        while ((curr != null && curr.left != null)) {
            curr = curr.left;
        }
        return curr;
    }

    public static void main(String[] args) {

    }
}
