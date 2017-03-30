/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprogram;

import java.util.Scanner;

/**
 *
 * @author sony
 */
public class Stringmobile {
    
    
public static void main(String[] args) {
        long mobile; 
        int count=0;
        char s2;
        boolean flag=true;
         String s3="" ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any mobile number");
        mobile=s.nextLong();
        String s1=String.valueOf(mobile);
        for(int i=0;i<s1.length();i++)
        {
            for(int k=0;k<s3.length();k++)
                if (s3.charAt(k)==s1.charAt(i))
                
                    flag=false;
                
                if (flag==true)
                {
                   s2=s1.charAt(i);
                
                for(int j=0;j<s1.length();j++)
            {
                if (s2==s1.charAt(j))
                {
                    count++;
                }
            }
                System.out.println("The" + s1.charAt(i)+ "digit comes" +count +"times in phn no.");
                count=0;
                s3=s3+s1.charAt(i);
            }
                flag=true;
            }
            
}
}
