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
public class SmallestNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b)
        {
            if(a<c)
            {
                System.out.println(a+" is smallest");
            }
            else
            {
                System.out.println(c+" is smallest");
            }
        }
        else
        {
            if(b<c)
            {
                System.out.println(b+" is smallest");
            }
            else
            {
                System.out.println(c+" is smallest");
            }
        }
    }
    
}
