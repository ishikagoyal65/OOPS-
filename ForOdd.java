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
public class ForOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    
}
