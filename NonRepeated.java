/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

/**
 *
 * @author ishik
 */
import java.util.Scanner;
public class NonRepeated {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string");
       String s=sc.nextLine();
       char ch=checkrep(s);
       System.out.println(ch);       
    }
    public static char checkrep(String s)
    {
        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)== s.charAt(j)){
                    flag=true;
                    break;
                }
            }
           if(flag==false){
                return s.charAt(i);
            } 
            
        }
        return ' ';
    }
    
}
