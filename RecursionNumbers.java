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
public class RecursionNumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit\n");
        int n=sc.nextInt();
        print(1,n);
    }
    public static void print(int i,int n)
    {
        if(i>n)
            return;
        System.out.println(i);
        print(i+1,n);
    }
    
}
