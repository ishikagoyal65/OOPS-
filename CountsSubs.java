/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;
import java.util.Scanner;
public class CountsSubs {
    
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String txt = sc.nextLine();
        System.out.println("Enter substring");
        String pat=sc.next();
        System.out.println(countFreq(pat, txt));
    }
    public static int countFreq(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        int res = 0;
        for (int i = 0; i <= l2 - l1; i++) {
            int j;
            for (j = 0; j < l1; j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }
            if (j == l1) {
                res++;
                j = 0;
            }
        }
        return res;
    }
    
}
