package com.dawit;

public class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data=data;
	}
}
 class Max_depth {
	 static int countr = 1;
	 static   int countl= 1;
	static int getMax_depth(TreeNode root){
		if(root== null){
            return 0;
        }
        if(root.left !=null){
         countl++;   
         getMax_depth(root.left);
        }
        if(root.right !=null){
            countr++;
            getMax_depth(root.right);
            
        }
       return countr>countl?countr:countl;
	}

	public static void main(String[]args){
		
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(2);
		root.right = new TreeNode(4);
		root.left.left= new TreeNode(1);
		root.left.left.left = new TreeNode(3);
		root.left.left.left.right = new TreeNode(-1);
	}
}
