package com.Codechef;
import java.util.*;

public class _Iterative_saerch_in_bst_ {

    static class Node{
        int key;
        Node left,right;
        public Node(int key){
            this.key = key;
        }
    }
    public static boolean search(Node root,int x){
        while(root!=null){
            if(root.key==x){
                return true;
            }
            else if(root.key>x){
                root = root.left;
            }
            else if(root.key<x){
                root = root.right;
            }

        }
        return false;
    }






    public static void main(String[] args) {

    }


}
