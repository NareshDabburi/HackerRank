import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
       String s1=" ";
            
            int x=x1,y=x2,flag=0;
            if(x!=y){
            for(int i=1;i<100000;i++){
                x+=v1;
                y+=v2;
               
                if(x==y){
                    flag=1;
                    
                    break;}
                    else{
                       
                    }
            }}
            if (flag==1){
              s1="YES";}
            else{
                s1="NO";  }     
            
    return s1;}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
   }
}
