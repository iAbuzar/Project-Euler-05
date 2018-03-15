import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            long temp=n;
            int check=0;
            while(true)
            {
               for(int i = n; i>0; i--)
               {
                    if(temp%i !=0)
                    {
                      temp = temp + n; 
                            break;
                    }
                   if(i==1)
                     {
                           check = 1;
                           break;
                     }
               }
               
               if(check==1)
                   break;
           }
            System.out.println(temp);
        }
          
    }
}
