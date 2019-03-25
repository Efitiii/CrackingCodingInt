package linkedList.loopDetection;

import java.util.LinkedList;

public class LoopDetector_2ndApproach {
	
	public Integer loopDetector(MyLinkedList input){
		
		Node slowRunner= input.head;
		Node fastRunner= input.head;
		
		while (!(slowRunner.value==fastRunner.value) && slowRunner!=null && fastRunner!=null){
			slowRunner=slowRunner.next;
			fastRunner=fastRunner.next.next;
		}
		
		if (slowRunner==null || fastRunner==null){
			return null;
		}
		
		// To make both the slowRunner and the fastRunner meet at the loop start
		
		slowRunner=input.head;
		
		while (slowRunner!=fastRunner){
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next;
		}
		
		
		return slowRunner.value;
	}

}
