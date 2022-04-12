package com.Codechef;
import java.util.*;

public class _iterative_insertion_in_bst_ {
    static class Node{
        int key;
        Node left,right;
        public Node(int key){
            this.key = key;
        }
    }
    public static Node insert(Node root,int x){
        Node temp = new Node(x);
        Node parent = null;
        Node curr = root;
        while(curr!=null){
            parent = curr;
            if(curr.key>x){
                curr = curr.left;
            }
            else if(curr.key<x){
                curr = curr.right;
            }
            else
                return root;

        }
        if(parent==null){
            return temp;
        }
        if(parent.key>x){
            parent.left = temp;
        }
        else{
            parent.right = temp;
        }
        return root;
    }


}
