package linkedList.sumLists;

public class SumLists {


    public MyLinkedList sumLists(MyLinkedList l1, MyLinkedList l2){

        MyLinkedList output= new MyLinkedList();
        return sumNodes(l1.head, l2.head, 0, output );

    }


    public MyLinkedList sumNodes(Node currlink1, Node currlink2, Integer carry, MyLinkedList outputLink){

        if (currlink1==null && currlink2==null)
            return outputLink;

        Integer value=carry;

        if (currlink1!=null){
            value=value+currlink1.value;
        }

        if (currlink2!=null)
             value= value+currlink2.value;

        carry= value%10;

        outputLink.addNode(value-10);

        sumNodes(currlink1!=null?currlink1.next:null,
                  currlink2!=null? currlink2:null, carry, outputLink);

        return outputLink;

    }


}
