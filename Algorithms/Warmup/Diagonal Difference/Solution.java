import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,j;
        int s1=0,s=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(n>1){
        int [][]a=new int[n][n];
        for( i=0;i<n;i++){
            for( j=0;j<n;j++){
                
                a[i][j]=sc.nextInt();
            }
        }
             for( i=0;i<n;i++){
            for( j=0;j<n;j++){
                if(i==j){
                    s=s+a[i][j];
                }
            }
           }
            //int c1=0,c2=n-1;
            for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((i+j) == n-1){
                    s1=s1+a[i][j];
                    //c1++;
                    //c2--;
                }
            }
           }
        int x;
        x=s-s1;
        if(x<0){
            x=-x;
        }
        //System.out.println(s);
        //System.out.println(s1);
        System.out.println(x);}
    }
}
