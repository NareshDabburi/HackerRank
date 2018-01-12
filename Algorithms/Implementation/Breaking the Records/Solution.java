import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        int max=score[0],min=score[0],counter_max=0,counter_min=0;
        int result[]=new int [2];
        for(int i=1;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
                counter_max+=1;
            }
            if(score[i]<min){
                min=score[i];
                counter_min+=1;
            }
        }
        result[0]=counter_max;
        result[1]=counter_min;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
