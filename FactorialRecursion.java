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
public class FactorialRecursion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FactorialRecursion ob=new FactorialRecursion();
        System.out.println(ob.fact(n));
        
    }
    public int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    
}
