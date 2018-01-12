import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int max=0,result=0;
        for(int i=1;i<=5;i++){
            int count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[j]==i){
                    count+=1;
                }
            }
            if(count>max){
                max=count;
                result=i;
            }
        }
       return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
