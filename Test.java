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
class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1 is running\n");
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 is running\n");
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
public class Test 
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}