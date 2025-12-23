/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter array elemnets");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        boolean flag=duplicateElement(ar,n);
        if(flag== true)
            System.out.println("Duplicate Exists");
        else
            System.out.println("Duplicate doesn't exist");
        
    }
    public static boolean duplicateElement(int ar[],int n){

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
    
}
