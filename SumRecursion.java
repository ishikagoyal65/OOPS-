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
public class SumRecursion {
    int s=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumRecursion sr=new SumRecursion();
        System.out.println(sr.sum(n));
    }
    public int sum(int n)
    {
        if(n==0)
        return 0;
        s = n+sum(n-1);
        return s;
    }
}
    

