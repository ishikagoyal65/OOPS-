/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

public class Student {
    String name;
    int stdid;
    char grade;
    public Student(String n,int id)
    {
        this.name=n;
        this.stdid=id;
    }
    public Student(String n,int id,char g)
    {
        this(n,id);
        this.grade=g;
    }
    public static void main(String args[])
  {
        Student s1=new Student("Ishika",123);
        System.out.println("Student name ="+s1.name);
        System.out.println("Student ID = "+s1.stdid);
        Student s2=new Student("Isha",456,'A');
        System.out.println("Student name ="+s2.name);
        System.out.println("Student ID = "+s2.stdid);
        System.out.println("Student ID = "+s2.grade);
    }
}
