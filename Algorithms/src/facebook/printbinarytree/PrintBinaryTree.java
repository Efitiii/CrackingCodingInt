package facebook.printbinarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


       //A
	 //  \\
    //B     C
   // \\  //\\
  //D   G  K  L
	

//A / B  C / K L D G / 

public class PrintBinaryTree {
	
	Queue<Node> output;
	MyBinaryTree adder;
	String space;
	StringBuilder str;
	Integer count2;
	Integer count;
	
	PrintBinaryTree(){
		this.output= new LinkedList<Node>();
		this.adder=new MyBinaryTree();
		this.space="                                   ";
		this.str=new StringBuilder();
		this.count2=0;
		this.count=0;
		
	}
	
	public void printBT(MyBinaryTree input){
		if (input.root.val==null){
			System.out.println("Empty Tree");
		}
		
		else{
			//output.add(new Node('/',null,null));
			output.add(input.root);
			count=count+2;
			str.append(space).append(input.root.val).append("\n").append(space.substring(0, space.length()-count)).append("/").append("  ").append("\\").append("\n");
			System.out.println(input.root.val);
			output.add(new Node('/',null,null));
				traverse(output);
		}
		
		
		
	}
	
	public void traverse(Queue<Node> output){
		Integer count2=0;
		boolean newValue=false; // / H / F J / D G I K / 
		boolean first=false;
		StringBuilder leftS;
		StringBuilder rightS;
		
		while (count2<1){
			Node next=output.poll();
			if (next.val.equals('/')){
				count2++;
				//output.add(new Node('/',null,null));
					}
			else{
				
				if (next.left!=null){
					output.add(next.left);
					
					leftS=new StringBuilder();
					leftS.append(space.substring(0,3)).append(next.left.val).append("\n").append(space.substring(0,3)).append("/").append("  ").append("\\");
					if (first==false){
					count=count+2;
					str.append(space.substring(0,space.length()-count)).append(leftS.toString());
					System.out.println(str.toString());
					first=true;
					}
					else{
						str.append(leftS);
						}
					System.out.print(next.left.val);
					newValue=true;
				}
				
				if (next.right!=null){
					output.add(next.right);
					rightS=new StringBuilder();
					rightS.append(space.substring(0,3)).append(next.right.val).append("\n").append(space.substring(0,2)).append("/").append("  ").append("\\");
					if (first==false){
						count=count+2;
						str.append(space.substring(0,space.length()-count)).append(rightS.toString());
						first=true;
						}
						else{
							str.append(rightS);
							}
					System.out.print(next.right.val);
					newValue=true;
				}
				
			}
			
		}
		System.out.println("");
		
		output.add(new Node('/',null,null));
		
		if (newValue==true){
			str.append("\n");
			traverse(output);
		}
		
	System.out.println(str.toString());	
	}

}
