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
public class NotesDenomination {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt=sc.nextInt();
        int fiveh=amt/500;
        amt=amt%500;
        int twoh=amt/200;
        amt=amt%200;
        int oneh=amt/100;
        amt=amt%100;
        int fifty=amt/50;
        amt=amt%50;
        int twenty=amt/20;
        amt=amt%20;
        int ten=amt/10;
        amt=amt%10;
        int five=amt/5;
        amt=amt%5;
        int two=amt/2;
        amt=amt%2;
        int one=amt/1;
        amt=amt%1;
        System.out.println("500 :"+fiveh);
        System.out.println("200 :"+twoh);
        System.out.println("100 :"+oneh);
        System.out.println("50 :"+fifty);
        System.out.println("20 :"+twenty);
        System.out.println("10 :"+ten);
        System.out.println("5 :"+five);
        System.out.println("2 :"+two);
        System.out.println("1 :"+one);
        
        
    }
    
}
