package stacksandqueues.threestacks;



import junit.framework.TestCase;
import org.testng.annotations.Test;

public class TestStacksInAnArray extends TestCase{
	
	@Test
	public void testAddingToStackArray(){
		StacksInAnArray stackInArray= new StacksInAnArray(4,4);
		stackInArray.addToStack(1, 2);
		stackInArray.addToStack(1, 4);
		stackInArray.addToStack(1, 8);
		stackInArray.addToStack(1, 9);
		stackInArray.addToStack(1, 10);
		stackInArray.addToStack(1, 12);
		stackInArray.printMinimum(1);
		stackInArray.pop(1);
		stackInArray.printMinimum(1);
		
		//System.out.println("Peeked value is: "+ stackInArray.peek(1));
		//stackInArray.pop(1);
		//System.out.println("Peeked value is: "+ stackInArray.peek(1));
		
		
		//stackInArray.addToStack(2, 9);
	   //	stackInArray.addToStack(2, 8);
		
		//stackInArray.pop(2);
		//stackInArray.pop(2);
		
		//System.out.println("Peeked value for 2 is: "+ stackInArray.peek(2));
		
//		stackInArray.addToStack(2, 10);
//		stackInArray.addToStack(2, 11);
//		stackInArray.addToStack(2, 12);
//		stackInArray.addToStack(2, 12);
//		
//		stackInArray.addToStack(3, 7);
//		stackInArray.addToStack(4, 6);
		
	//	stackInArray.printStackValues(1);
	//	stackInArray.printStackValues(2);
	//	stackInArray.printStackValues(3);
	//	stackInArray.printStackValues(4);
		
	}
	
	

}
