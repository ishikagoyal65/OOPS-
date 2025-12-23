/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

public class Complex_Number {
    double real;
    double img;
    public Complex_Number(double r,double i)
    {
        this.real=r;
        this.img=i;
    }
    public Complex_Number(Complex_Number cn)
    {
        this.real=cn.real;
        this.img=cn.img;
    }
    public void display()
    {
        if(img<0)
        {
            System.out.println(real +" + "+img+ "-i");
        }
        else
        {
            System.out.println(real+ " + "+img+ "i");
        }
    }
    public static void main(String args[])
    {
        Complex_Number c1 = new Complex_Number(8.5,-4.5);
        Complex_Number c2=new Complex_Number(c1);
        c1.display();
        c2.display();
    }
}
