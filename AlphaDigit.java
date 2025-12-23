/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author ishik
 */
public class AlphaDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a'&& ch<='z')
        {
            System.out.println(ch+" is Alphabet");
        }
        else if(ch>='0'&& ch<='9')
        {
            System.out.println(ch+" is a Digit");
        }
        else
        {
            System.out.println(ch+" is a special character");
        }
        
    }
    
}
