import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int pos_apple=a;
        int pos_orange=b;
        int d_apple,d_orange;
        
        int c=0,s1=0;
        for(int i=0;i<m;i++){
            d_apple=apple[i]+pos_apple;
            if(d_apple>pos_apple){
               if((d_apple>=s)&&(d_apple<=t)){
                   c++;
               }
            }
        }
        System.out.println(c);
        for(int i=0;i<n;i++){
            d_orange=pos_orange+orange[i];
            if(d_orange<pos_orange){
                if((d_orange<=t)&&(d_orange>=s)){
                    s1++;
                }
                
            }
        }
        System.out.println(s1);
    }
}
