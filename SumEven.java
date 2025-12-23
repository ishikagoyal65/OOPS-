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
public class SumEven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        
        System.out.println("Sum of even numbers is :"+sum);
    }
}
