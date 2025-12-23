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
public class ReverseArrayRecursion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ReverseArrayRecursion ob=new ReverseArrayRecursion();
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
        
        ob.reverse(0,ar.length-1,ar);
    }
    public void reverse(int l,int r,int ar[])
    {
        if(l==r)
        {
            System.out.println("Array after reversing");
            for(int i=0;i<ar.length;i++)
            {
                System.out.println(ar[i]+" ");
            }
            return;
        }
        int temp=ar[l];
        ar[l]=ar[r];
        ar[r]=temp;
        reverse(l+1,r-1,ar);
    }

    void reverse(int i, int[] ar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
