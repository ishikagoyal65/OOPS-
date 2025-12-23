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
public class ReverseArrayTwoPointer {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array\n");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements\n");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Array before Reversing");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]+" ");
        }
        int left=0;
        int right=ar.length-1;
        while(left!=right)
        {
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
        System.out.println("Array after Reversing");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]+" ");
        }
    }
}
