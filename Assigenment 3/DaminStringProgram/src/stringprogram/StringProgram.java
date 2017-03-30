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
public class StringProgram{
    
public static void main(String[] args) {
        String s1 ;
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String");
        s1=s.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            
        if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
        {
            count++;
            
        }  
        }
System.out.println("total no of vowels is " + count);
}
}