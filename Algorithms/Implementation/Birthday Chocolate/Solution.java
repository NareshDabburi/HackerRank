import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        int i,j,result=0;
       for(i=0;i<(n-d+1);i++){
           int sum=0;
           for(j=0;j<d;j++){
               sum=sum+s[i+j];
           }System.out.print(sum);
           if(sum==m){
               result++;
           }else result=0;
       }return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
