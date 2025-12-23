/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.Scanner;

/**
 *
 * @author ishik
 */
public class Program {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enrer the limit");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}
