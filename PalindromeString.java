/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;
    import java.util.*;

public class PalindromeString {

 public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string");
       String s=sc.next();
        boolean res = isPalindrome(s);
        if (res) {
            System.out.println('"' + s + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + s + '"' + " is not a palindrome.");
        }
        }
    }

