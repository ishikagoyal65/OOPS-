/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;
/**
 *
 * @author ishik
 */
import java.util.Arrays;
import java.util.Scanner;
public class StringAnangram {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        
        if(checkAnagrams(s1, s2) == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
    public static void sortChar(char ch[])
    { 
        char temp;
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
    }
    public static boolean checkAnagrams(String s1, String s2) {
        
        if (s1.length() != s2.length()) 
            return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        sortChar(s1Array);
        sortChar(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

    
}
