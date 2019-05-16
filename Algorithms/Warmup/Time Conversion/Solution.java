import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       int l=s.length();
        System.out.println(l);
        String []time_arr=s.split(":");
        int hours=Integer.parseInt(time_arr[0]);
        int minutes=Integer.parseInt(time_arr[1]);
        int sec=Integer.parseInt(time_arr[2].substring(0,2));
        String am_pm=time_arr[2].substring(2, 4);
        if(am_pm.equalsIgnoreCase("AM")) {
            if(hours==12) {
                hours=12-12;
            }
        }
        else if(am_pm.equalsIgnoreCase("PM")) {
            if(hours==12) {
                hours=hours;
            }else {
            hours=hours+12;}    
        }
        String hrs=Integer.toString(hours);
        String mins=Integer.toString(minutes);
        String seconds=Integer.toString(sec);
        if(hours<10) {
            hrs="0"+hrs;
        }
        if(minutes<10) {
            mins="0"+minutes;
        }
        if(sec<10) {
            seconds="0"+sec;
        }
        s=hrs+":"+mins+":"+seconds;
        return s;
        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
