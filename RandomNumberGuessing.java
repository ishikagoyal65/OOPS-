/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author ishik
 */
public class RandomNumberGuessing {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (1 + (int) 100 * Math.random());
        System.out.println("A random number is selected within 1-100\n");
        System.out.println("You have been given 6 attempts to guess the correct number");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Guess the number");
            int guess = sc.nextInt();
            if (guess == n) {
                System.out.println("You have got the correct number in"+i+"attempts\n");
                return;
            } else if (guess < n) {
                System.out.println("The number is greater than your guess\n");
            } else {
                System.out.println("The number is smaller than your guess\n");
            }
        }
        System.out.println("You have exhausted all the attempts\n");
        System.out.println("The Random Number was :" + n);
        sc.close();
    }

}
