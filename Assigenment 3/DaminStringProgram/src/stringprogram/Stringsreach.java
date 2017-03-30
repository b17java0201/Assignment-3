/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprogram;

import java.util.Scanner;


public class Stringsreach {
    
    public static void main(String[] args) {
        String s1,s2 ;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String");
        s1=s.nextLine();
        System.out.println("Enter word to be searched ");
        s2=s.nextLine();
        
         
        if(s1.contains(s2))
        {
            
          System.out.println( s2 + " "+ "is present in String" );  
        }  
        

}
}
