/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.Scanner;

public class RotateArray {

    public static void rotateclockwise(int[] arr, int k){
        if (k == 0 || arr.length == 0) {
            return;
        }

        int n = arr.length;

        // rotate right by one position
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // recursive call for k - 1
        rotateclockwise(arr, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of steps");
        int k=sc.nextInt();
        rotateclockwise(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
