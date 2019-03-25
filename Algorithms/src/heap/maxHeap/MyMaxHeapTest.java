package heap.maxHeap;

import java.util.List;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class MyMaxHeapTest extends TestCase {
	
	@Test
	public void testMyMaxHeap(){
		
		MyMaxHeap myMax= new MyMaxHeap();
		
		MyMaxHeapEfficient myMaxE= new MyMaxHeapEfficient(7);
		myMax.insert(4);
		myMax.insert(3);
		myMax.insert(2);
		myMax.insert(7);
		myMax.insert(6);
		myMax.insert(1);
		
		myMaxE.insert(4);
		myMaxE.insert(3);
		myMaxE.insert(2);
		myMaxE.insert(7);
		myMaxE.insert(6);
		myMaxE.insert(1);
		
		//System.out.println(myMax.toString());
		
		List<Integer> output= myMax.getMyMaxHeap();
		Integer[] output2= myMaxE.getMyHeap();
		//output.forEach(a->System.out.println(a));
		
		for(int i=0;i<output2.length;i++){
			System.out.println(output2[i]);
		}
		
		
		
	}

}
