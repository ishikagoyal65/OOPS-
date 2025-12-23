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
public class PositiveSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num = 0,total=0;
        while(true)
        {
            System.out.println("Enter the number");
            num=sc.nextInt();
            if(num<=0)
            {
                break;
            }
            else
            {
                total+=num;
            }
        
        System.out.println("Sum : "+total);
            
    }
    
}
}
