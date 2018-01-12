import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int i,max=0,c=0;
        int [] result=new int[2];
        for(i=0;i<s.length;i++){
           if(s[i]>max){
               max=s[i];
               c++;
           }
        }result[0]=c-1;
        
        int min,a=0;
       
        if(s[0]==0){
            min=s[1];
        }else
            min=s[0];
        for(i=0;i<s.length;i++){
            if(min>s[i]){
                min=s[i];
                a++;
            }
        }

        result[1]=a;

        return result;
       
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
           s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
