package hackerRank.createStack;

import java.util.Scanner;

class Solution1 {
    static MyLinkedList mylink;
   // static Node header;
    
  // Solution (){
      
       //header=mylink.header;
       
  // }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       // mylink= MyLinkedList.getInstanseOfMyLinkedList();
    	mylink= new MyLinkedList();
        Scanner scanner= new Scanner (System.in);
        Integer count= Integer.parseInt(scanner.next());
      
        
        while (count>0){
            String input= scanner.next();
            
            switch(input){
                case "1":
                    Integer newValue= Integer.parseInt(scanner.next());
                    pushElement(newValue);
                    break;
                case "2":
                    deleteTopElement();
                    break;
                case "3":
                    Integer maximum=getMaximumValue();
                    if (maximum==null){
                        System.out.println("No element in the list");
                    }
                    else System.out.println(maximum);
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
    
    public static void pushElement(Integer input){
        //Node newInput= Node.getInstance(input, null, null);
       // Node newInput=new Solution.Node(input, null, null);
        Node newInput= Node.getInstance(input, null, null);
        if (mylink.header.next==null){
            mylink.header.next=newInput;
        }
        else {
            
            
            mylink.header.next.prev= newInput;
            newInput.next=mylink.header.next;
            mylink.header.next=newInput;  
            
        }
    }
    
  public static void deleteTopElement(){
      if (mylink.header.next==null){
          return;
      }
      else {
          if (mylink.header.next.next==null){
                mylink.header.next=null;
            }
          else{
          mylink.header.next.next.prev=mylink.header;
          mylink.header.next= mylink.header.next.next;
          }
        
      }
  }
    
 public static Integer getMaximumValue(){
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
        
        //MyLinkedList mylink;
        
        private MyLinkedList(){
            this.header=Node.getInstance(null, null, null);
        }
        
        public static MyLinkedList getInstanseOfMyLinkedList(){
        //     if (mylink==null){
        //         mylink= new MyLinkedList();
        // }
        //    return mylink;
            return new MyLinkedList();
        
    }
    }
    
    
    public static class Node{
        Integer value;
        Node prev;
        Node next;
        
        Node (Integer value, Node prev, Node next){
            this.prev=prev;
            this.next=next;
            this.value=value;
        }
        
        public static Node getInstance(Integer value, Node prev, Node next){
            return new Node(value, prev, next);
        }
        
        
        
    }
}