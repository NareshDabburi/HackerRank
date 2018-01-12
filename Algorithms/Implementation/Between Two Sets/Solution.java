import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
       
        int result=0;
        for(int i=a[a.length-1]; i<=b[0]; i++){
            int count = 0; 
            for(int j=0;j<a.length;j++){
                if(i%a[j]==0)
                    count++;
                else
                    break;
            }
            for(int k=0;k<b.length;k++){
                if(b[k]%i==0){
                    count++;
                }
                else
                    break;
            }
            if(count==(a.length+b.length))
                 result++;
        } 
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
