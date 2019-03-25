package fireCode.reverseAnInteger;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInteger {

    public static int reverseInt(int x) {
        boolean negative=false;
        Stack<Long> stack= new Stack<>();
        Double output= 0.00;
        int temp=x;
        double power=0;
        double remainder=x;
        Integer reversedNumber=0;

        if (x>=0 && x<10){
            return x;
        }

        if (x<0){
            negative=true;
            temp= temp * -1;
        }

        power=Math.round(Math.log10(x));
        Double itr= power;


        while (itr>=0){
            Double divider= Math.pow(10, itr);
            stack.add(Math.round(remainder/divider));
            remainder=remainder%divider;
            itr--;
        }

        itr=power;

        while (!stack.isEmpty() && itr>=0){
            output=output+ stack.pop()* Math.pow(10, itr);
            itr--;
        }

        reversedNumber = output.intValue();

        if (negative){
            reversedNumber=reversedNumber*-1;
        }

        return reversedNumber;

    }

    public static int reverseInt2(int x) {
        boolean negative=false;
        Stack<Long> stack= new Stack<>();
        Double output= 0.00;
        int temp=x;
        double power=0;
        double remainder=x;
        Integer reversedNumber=0;

        if (x>=0 && x<10){
            return x;
        }

        if (x<0){
            negative=true;
            remainder= remainder * -1;
        }

        power=Math.floor(Math.log10(remainder));
        Double itr= power;


        while (itr>=0){
            Double divider= Math.floor(Math.pow(10, itr));
            stack.add(Math.round(remainder/divider));
            remainder=remainder%divider;
            itr--;
        }

        itr=power;

        while (!stack.isEmpty() && itr>=0){
            output=output+ stack.pop()* Math.pow(10, itr);
            itr--;
        }

        reversedNumber = output.intValue();

        if (negative){
            reversedNumber=reversedNumber*-1;
        }

        return reversedNumber;

    }
}
