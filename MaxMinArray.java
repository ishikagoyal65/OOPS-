/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.Scanner;

public class MaxMinArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter array elemnets");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int max= maxElement(ar,n);
        int min =minElement(ar,n);
        System.out.println("Maximum Element = "+max);
        System.out.println("Minimum Element = "+min);

    }
    public static int maxElement(int ar[],int n){
        int max= ar[0];
        for(int i=1;i<n;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
    public static int minElement(int ar[],int n){
        int min= ar[0];
        for(int i=1;i<n;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }
}
