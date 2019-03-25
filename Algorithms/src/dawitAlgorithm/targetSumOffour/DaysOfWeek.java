package dawitAlgorithm.targetSumOffour;

public class DaysOfWeek {

    public String solution(String S, int K) {
        // write your code in Java SE 8

        String output="";
        Integer exactDayValue=0;


        Integer daysValue= getDayInInt(S);


        if (daysValue!=0) {

            exactDayValue = daysValue + K;
        }

        if (exactDayValue>7) {

            exactDayValue= (K%7)+daysValue;
        }

        return getDayInString(exactDayValue);

    }



    private Integer getDayInInt(String s) {

        Integer output = 0;

        switch (s) {
            case "Mon":
                output = 1;
                break;
            case "Tue":
                output = 2;
                break;
            case "Wed":
                output = 3;
                break;
            case "Thu" :
                output = 4;
                break;
            case "Fri" :
                output = 5;
                break;
            case "Sat" :
                output = 6;
                break;
            case "Sun" :
                output = 7;
                break;


        }

        return output;
    }

    private String getDayInString(Integer in) {

        String output = "";

        switch (in) {
            case 1:
                output = "Mon";
                break;
            case 2:
                output = "Tue";
                break;
            case 3:
                output = "Wed";
                break;
            case 4 :
                output = "Thu";
                break;
            case 5 :
                output = "Fri";
                break;
            case 6 :
                output = "Sat";
                break;
            case 7 :
                output = "Sun";
                break;


        }

        return output;
    }
}
