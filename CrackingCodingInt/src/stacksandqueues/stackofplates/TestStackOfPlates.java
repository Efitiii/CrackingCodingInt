package stacksandqueues.stackofplates;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestStackOfPlates extends TestCase{
	
	@Test
	public void testStackOfPlates (){
		StackOfPlates plates= new StackOfPlates(5);
		plates.pushToStack(3);
		plates.pushToStack(2);
		plates.pushToStack(5);
		plates.pushToStack(7);
		plates.pushToStack(9);
		//plates.printStack();
		
		plates.pushToStack(4);
		plates.pushToStack(6);
		//plates.printStack();
		
		System.out.println(plates.popStack());
		
		plates.peekStack();
		
		plates.printStack();
		
	}

}
