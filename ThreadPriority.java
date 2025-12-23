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
    class MyThread extends Thread {
    public MyThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
        for (int i = 1; i <= 5; i++)
            System.out.println(getName() + " " + i);
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        new MyThread("MIN", Thread.MIN_PRIORITY).start();
        new MyThread("NORM", Thread.NORM_PRIORITY).start();
        new MyThread("MAX", Thread.MAX_PRIORITY).start();
    }
}


