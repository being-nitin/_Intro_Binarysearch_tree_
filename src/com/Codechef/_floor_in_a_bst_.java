package com.Codechef;
import java.util.*;

public class _floor_in_a_bst_ {
    static class Node{
        int key;
        Node left,right;
        public Node(int key){
            this.key = key;
        }
    }
    public static Node floor(Node root,int x){
        Node res = null;
        while(root!=null){
            if(root.key==x){
                return root;
            }
            if(root.key>x){
                root = root.left;
            }
            else{
                res=root;
                root = root.right;
            }
        }
        return res;
    }
}
