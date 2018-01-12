import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        int s=0,s1=0,result=0;
        for(int i=0;i<n;i++){
            s=s+ar[i];
        }
        //System.out.println(s);
        if(k<=n){
            s1=s-ar[k];
        }
        int s2=s1/2;
        //System.out.println(s2);
        if(s2<b){
            return (b-s2);
        }else{
           // System.out.println("Bon Appetit");
           return 0;
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result==0){
        System.out.println("Bon Appetit");}else{
            System.out.println(result);
        }
    }
}
