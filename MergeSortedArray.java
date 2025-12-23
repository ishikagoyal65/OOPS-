/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;
import java.util.Scanner;

public class MergeSortedArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int n = sc.nextInt();
        int ar1[] = new int[n];

        System.out.println("Enter elements of array 1");
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array 2");
        int m = sc.nextInt();
        int ar2[] = new int[m];
        System.out.println("Enter elements of array 2");
        for (int i = 0; i < m; i++) {
            ar2[i] = sc.nextInt();
        }
        sortArray(ar1, n);
        sortArray(ar2, m);
        mergeArray(ar1, ar2, n, m);

    }

    public static void mergeArray(int ar1[], int ar2[], int n, int m) {
        int marray[] = new int[m + n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            marray[k] = ar1[i];
            k++;
        }
        for (int i = 0; i < m; i++) {
            marray[k] = ar2[i];
            k++;
        }
        sortArray(marray,m+n);
        display(marray, m + n);

    }
    public static void sortArray(int ar[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }
    public static void display(int ar[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
