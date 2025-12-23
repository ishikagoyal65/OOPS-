/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string");
       String s=sc.next();
        System.out.println("Reverse String = "+reverse(s));
        }
    
}
