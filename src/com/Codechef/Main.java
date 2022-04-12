package com.Codechef;
import java.util.*;
public class Main {
static class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
    }
}
 public static boolean search(Node root, int x){
    if(root==null){
        return false;
    }
    if(root.key<x){
        return search(root.right,x);
    }
    else if(root.key>x){
        return search(root.left,x);
    }
    else
        return true;
}




public static void main(String[] args)
    {
        // write your code here
    }
}
