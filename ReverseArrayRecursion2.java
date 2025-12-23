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
public class ReverseArrayRecursion2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ReverseArrayRecursion2 ob=new ReverseArrayRecursion2();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Array before Reversing");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]+" ");
        }
        
        ob.reverse(0,ar);
    }
    public void reverse(int i,int ar[])
    {
        if(i>=(ar.length)/2)
        {
            System.out.println("Array after reversing");
            for(int j=0;j<ar.length;j++)
            {
                System.out.println(ar[j]+" ");
            }
            return;
        }
        int temp=ar[i];
        ar[i]=ar[ar.length-i-1];
        ar[ar.length-i-1]=temp;
        reverse(i+1,ar);
    }
}