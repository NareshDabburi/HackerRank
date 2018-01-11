import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];double p=0,n1=0,o=0;double r=0.00000000;int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]>0)
                p++;
            else if(arr[i]<0)
                n1++;
            else 
                o++;
        }
        /*System.out.println(p);
        System.out.println(n);
        r=p/n;*/
        
        DecimalFormat numberFormat = new DecimalFormat("#.000000");
        System.out.println(numberFormat.format(p/n));
        System.out.println(numberFormat.format(n1/n));
        System.out.println(numberFormat.format(o/n));
        
        //System.out.print((String.format("%.5f",(p/n1))));
        //System.out.println(fmt);
    }
}
