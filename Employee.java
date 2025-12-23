/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

public class Employee {
   String name;
   int empid;
   String desig;
   int salary;
   public Employee(String name)
   {
       this.name=name;
       this.empid=0;
       this.desig="";
       this.salary=0;
   }
   public Employee(String n,int id,String d)
   {
       this(n);
       this.empid=id;
       this.desig=d;
   }
   public Employee(String n,int id,String d,int s)
   {
       this(n,id,d);
       this.salary=s;
   }
   public void display()
   {
       System.out.println("Employee Name = "+name);
       System.out.println("Employee ID = "+empid);
       System.out.println("Employee Designation = "+desig);
       System.out.println("Employee Salary = "+salary);
   }
   public static void main(String args[])
   {
      Employee e1= new Employee("Ishika");
      Employee e2=new Employee("Isha",1245,"Developer");
      Employee e3=new Employee("Anshika",13652,"Engineer",520000);
      e1.display();
      e2.display();
      e3.display();
      
   }
}
