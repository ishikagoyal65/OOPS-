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
    class DaemonThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("Daemon " + i);
    }
}

class UserThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++)
            System.out.println("User " + i);
    }
}

public class ThreadDaemon {
    public static void main(String[] args) {
        DaemonThread d = new DaemonThread();
        d.setDaemon(true);
        d.start();

        new UserThread().start();
    }
}


