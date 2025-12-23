/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;
import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elemnets");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        revArray(ar,n);
        
    }
    public static void revArray(int ar[],int n){
        int rev[]=new int[n];
        int i=0;
            for(int j=n-1;j>=0;j--){
                rev[i]=ar[j];
                i++;
            }
            for(int j=0;j<n;j++){
            System.out.print(rev[j]+" ");
        }
    }
}
