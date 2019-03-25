package sortingandsearching.mergeSort;

public class MyMergeSort {


    public void sortArray(Integer[] input){

        Integer[] output= new Integer[input.length];

        sortArray(input,output,0, input.length-1);

    }


    private void sortArray(Integer[] input, Integer[] output, int start, int end){

        int mid= (start+end)/2;

        if (end<=start)
            return;



        sortArray(input, output, start, mid);
        sortArray(input, output, mid+1, end);
        merge(input, output,start,end);


    }


    private void merge(Integer[] input, Integer[] output, int start, int end){


        int mid= (start+end)/2;
        int i=start;
        int u=mid+1;
        int current=start;

        for (int j=start;j<=end;j++){
            output[j]=input[j];
        }

        while (i<=mid && u<=end ){
            if (output[i]<output[u]){
                input[current]=output[i];
                i++;
            }
            else {
                input[current] = output[u];
                u++;
            }

            current++;
        }

        int remaining= mid-i;

        for (int z=0;z<=remaining;z++){
            input[current+z]=output[z+i];
        }


// Works but better solution is given above
//        while (i<=mid){
//          if (output[i]>output[u]){
//              Integer temp= output[u];
//              output[u]= output[i];
//              output[i]=temp;
//
//              int x=u;
//
//              while (x+1<=end && output[x]>output[x+1]){
//                  Integer temp2=output[x];
//                  output[x]=output[x+1];
//                  output[x+1]=temp2;
//              }
//          }
//
//        }



    }
}
