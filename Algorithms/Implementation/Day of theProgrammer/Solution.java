import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        String y=Integer.toString(year);
        String day="";
        
        
        if((year>=1700)&&(year<=1917)){
            if(year % 4==0){
                day="12.09."+y;
            }else{
                day="13.09."+y;
            }
        }
        else if(year==1918){
            day="26.09."+y;
        }
        else if((year>1918)&&(year<=2700)){
            if(((year%4==0)&&(year%100!=0))||(year%400==0)){
               day="12.09."+y;
            }else{
                day="13.09."+y;
            } 
           
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
