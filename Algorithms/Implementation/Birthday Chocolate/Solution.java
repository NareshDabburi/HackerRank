import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        /*for(int k=n;k<=n+m;k++){
            s[k]=0;
        }*/
        
        int i,j,c=0;
        for(i=0;i<=(n-m);i++){
            int s1=0;
            for(j=0;j<m;j++){
                s1=s1+s[i+j];
            }
            if(s1==d){
                c++;
            }
        }
        return c;
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
