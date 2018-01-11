import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];int x=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=0; i < 5; i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]>arr[j]){
                    x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
         }long s=0,s1=0;
        for(int i=0;i<4;i++){
            s=s+arr[i];
            s1=s1+arr[i+1];
        }
        System.out.print(s+" "+s1);
    }
}
