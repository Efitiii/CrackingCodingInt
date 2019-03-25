package hackerRank.heightOfTree;

import java.util.Scanner;

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
             int height=0;

        if (root.left!=null || root.right!=null){
         return computeHeight(root, height);   
        }
       return 0;
    }

    private static int computeHeight(Node root, int height){

        int rightHeight=height;
        int leftHeight=height;

        if (root.left==null && root.right==null){
            return height;
        }

        if (root.left!=null){
           leftHeight= computeHeight(root.left,height+1);
        }

        if (root.right!=null){
            rightHeight= computeHeight(root.right,height+1);
        }

        return rightHeight>=leftHeight?rightHeight:leftHeight;
    }



	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
