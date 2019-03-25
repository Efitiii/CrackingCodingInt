package hackerRank.climbingTheLeaderboard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static List<Integer> tree;
    int yourRank;
    boolean rankFound;

    Solution(){
        this.tree= new ArrayList<>();
        this.yourRank=0;
        this.rankFound=false;
    }

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] output= new int[alice.length];
        for (int i=0;i<scores.length;i++){
            if (tree.size()==0){
                tree.add(scores[i]);
            }
            else{
              //  int lastValue= tree.size()-1;
                insertToTree(scores[i]);
            }
        }

        for(int u=0;u<alice.length;u++){
            output[u]=findScore(alice[u]);
        }

      return output;

    }

    static int findScore(int i){

        int currentParent= getParent(tree.size()-1);
        while (tree.get(currentParent)<i){
            currentParent=getParent(currentParent);
        }

        currentParent++;

        while (tree.size()<currentParent && tree.get(currentParent)>i){
            currentParent++;
        }

        return currentParent;

    }

    static void insertToTree(int input){
        Integer iterator= tree.size();
        tree.add(input);

        while (tree.get(iterator)>tree.get(getParent(iterator))){
            Collections.swap(tree,iterator, getParent(iterator));
            iterator=getParent(iterator);
        }
    }




    static void heapify(int index){

        if (isLeaf(index)){
            return;
        }

        if (tree.get(index)<tree.get(getLeft(index)) || tree.get(index)<tree.get(getRight(index))){
             if (tree.get(getLeft(index))>tree.get(getRight(index))){
                 Collections.swap(tree,getLeft(index),index);
                 heapify(getLeft(index));
             }
             else {
                 Collections.swap(tree,getRight(index), index);
                 heapify(getRight(index));
             }
        }

    }

    static boolean isLeaf(int index){

        if (index>=tree.size()/2 && index<tree.size()){
            return true;
        }

        return false;
    }



    static int getParent(int index){
        return index/2;
    }

    static int getLeft(int index){
        return 2*index;
    }

    static int getRight(int index){
        return 2*index+1;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
