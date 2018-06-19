package stackandqueue.queuebackedbyTwoStack;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TwoStackQueueTest extends TestCase {

	@Test
	public void twoStackQueueTest(){
		TwoStackQueue twoS= new TwoStackQueue();
		twoS.enqueue("Efrem");
		System.out.println(twoS.peek());
		twoS.enqueue("Dawit");
		twoS.enqueue("Habtom");
		System.out.println(twoS.peek());
		twoS.dequeue();
		System.out.println(twoS.peek());
		
		//Dawit Habtom 
		
	}
}
