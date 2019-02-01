package facebook.printbinarytree;


import junit.framework.TestCase;

public class TestPrintBinaryTree extends TestCase {

	public void printBinaryTree(){
		MyBinaryTree tree= new MyBinaryTree();
		tree.add('H');
		tree.add('F');
		tree.add('J');
		tree.add('G');
		tree.add('I');
		tree.add('D');
		tree.add('H');
		tree.add('E');
		tree.add('K');
		
		PrintBinaryTree print= new PrintBinaryTree();
		print.printBT(tree);
		
		
	}

}
