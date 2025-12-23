/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author ishik
 */
public class RecursionName {
    public static void main(String args[])
    {
        print(1,5);
    }
    public static void print(int i,int n)
    {
        if(i>n)
        {
            return;
        }
            System.out.println("Ishika");
            print(i+1,n);
  
    }
    
}
