package hackerRank.printTreeInOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
      
      Queue<Node> queue= new LinkedList<Node>();

        queue.add(root);
        while (!queue.isEmpty()){
            Node currentNode=queue.remove();
            System.out.print(currentNode.data+" ");
             if (currentNode.left!=null){
                 queue.add(currentNode.left);
             }
             if (currentNode.right!=null){
                 queue.add(currentNode.right);
             }

        }

      
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
        levelOrder(root);
    }	
}
