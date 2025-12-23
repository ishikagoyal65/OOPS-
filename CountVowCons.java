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
public class CountVowCons {

    public static void main(String[] args) {
        int vow = 0, cons = 0, dig = 0, sp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;
            } else if ((ch >= 'b' && ch <= 'd') || (ch >= 'f' && ch <= 'h') || (ch >= 'j' && ch <= 'n') || (ch >= 'p' && ch <= 't') || (ch >= 'v' && ch <= 'z')) {
                cons++;
            } else if (ch >= '0' && ch <= '9') {
                dig++;
            } else {
                sp++;
            }

        }
        System.out.println("Count of Vowels = "+vow);
        System.out.println("Count of consonants = "+cons);
        System.out.println("Count of Digits = "+dig);
        System.out.println("Count of Special Characters = "+sp);
    }
}
