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
public class Stringpalindrome {
    
    public static void main(String[] args) {
        String s1,s2="";
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String");
        s1=s.nextLine();
       
        for( i=s1.length()-1;i>=0;i--)
        {
            
      s2=s2+s1.charAt(i);
 
        }
        if(s1.equals(s2))        
 System.out.println("String is palindrome");
 else 
      System.out.println("String is not palindrome");
}
}
