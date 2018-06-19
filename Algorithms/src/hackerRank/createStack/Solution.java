package hackerRank.createStack;

import java.util.Scanner;

public class Solution {
    static MyLinkedList mylink;
    //static Node header;
    
   Solution (){
	   
       //header=mylink.header;
       
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	mylink= MyLinkedList.getInstanseOfMyLinkedList();
    	//mylink= new MyLinkedList();
    	
        Scanner scanner= new Scanner (System.in);
      
        Integer count= Integer.parseInt(scanner.next());
      
        
        while (count>=0){
            String input= scanner.next();
            
            switch(input){
                case "1":
                    Integer newValue= Integer.parseInt(scanner.next());
                    pushElement(newValue, mylink);
                    break;
                case "2":
                    deleteTopElement(mylink);
                    break;
                case "3":
                    Integer maximum=getMaximumValue(mylink);
                    System.out.println(maximum);
                    break;
                    
            }
            count--;
//           if (input1.equals("1")){
//               String newValue= scanner.next();
//               pushElement(newValue);
//           }
//             else if (input1.equals("2")){
                
//             }
//             else if (input1.equals("3")){}
            
        }
        
//         Node next=mylink.header.next;
        
//         if (next==null){
//             System.out.println("The list is empty");
//         }
//         else {
//             while (next!=null){
//                 System.out.println(next.value);
//                 next=next.next;
//         }
        
    }
    
    public static void pushElement(Integer input, MyLinkedList mylink){
   
       // Node newInput=  Node.getInstance(input, mylink.header, mylink.header.next);
    	//Node newInput=  Node.getInstance(input, null, null);
    	//Node newInput= new Node(input,mylink.header,mylink.header.next);
    	Node newInput= new Node(input,null,null);

    	
        if (mylink.header.getNext()==null){
            mylink.header.next=newInput;
        }
        else {
            mylink.header.next.prev= newInput;
            newInput.next=mylink.header.next;
            mylink.header.next=newInput;  
        }
    }
    
  public static void deleteTopElement(MyLinkedList mylink){
      if (mylink.header.next==null){
          return;
      }
      else if(mylink.header.next.next==null){
    	  mylink.header.next=null;
      }
      else {
    	  mylink.header.next.next.prev=mylink.header;
          mylink.header.next= mylink.header.next.next;
          //mylink.header.next.next.prev=mylink.header;
      }
  }
    
 public static Integer getMaximumValue(MyLinkedList mylink){
     Integer maximum=0;
      if (mylink.header.next==null){
          return null;
      }
     else{
         Node next=mylink.header.next;
         while (next!=null){
             if (mylink.header.next.value>maximum){
                 maximum=mylink.header.next.value;
             }
             next=next.next;
         }
         return maximum;
     }
     
 }
    
    public static class MyLinkedList{
        Node header;
        
        private static MyLinkedList mylink;
        
        MyLinkedList(){
            this.header=new Node(null, null, null);
        }
        
        public static MyLinkedList getInstanseOfMyLinkedList(){
            if (mylink==null){
                mylink= new MyLinkedList();
        }
            return mylink;
        
    }
    }
    
//    public static class Node{
//        Integer value;
//        Node prev;
//        Node next;
//        public static Node node;
//        
//        Node (Integer value, Node prev, Node next){
//            this.prev=prev;
//            this.next=next;
//            this.value=value;
//        }
//        
//        public static Node getInstance(Integer value, Node prev, Node next){
//        	return node = new Node(value,prev,next);
//        }
//    }
        
    
    
   
}
