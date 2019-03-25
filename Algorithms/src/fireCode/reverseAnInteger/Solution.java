package fireCode.reverseAnInteger;

import java.sql.SQLOutput;

class Solution {

    public static void main(String[] args) {

        //Solution sol= new Solution();
        Integer result= reverseNumber(123);
        Integer expected= 321;

        Integer resultN= reverseNumber(-123);
        Integer expectedN= -321;


        System.out.println("Result for a positive Number is:"+result);

        System.out.println("Result for a negative Number is:"+resultN);

        //System.out.println(10^3);

    }




    public static Integer reverseNumber(Integer in){ // 123



        Integer output=0;

        Integer rem=0;
        Integer div=in;
        boolean neg=false;

        Double result=0.00;



        // 2.

        if (in<0){
            neg=true; //false
            in=in*-1;
            div=in;
        }

        if (in==0){
            return 0;
        }

        Double powerValue= Math.log10(in);
        powerValue.intValue();

        Integer pow=powerValue.intValue();
        Integer itr=pow;



        for (int i=0;i<=pow;i++){ //1

            rem= div%10; // 1
            div= div/10; //0


            result= rem * Math.pow(10,itr);

            output=output + result.intValue(); //321

            itr--;
        }

        if (neg){
            output=output*-1;
        }

        return output;


    }

}
