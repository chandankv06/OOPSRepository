package com.Constructoroverloading;
class Employee{
    String name;
    int empid;
    int salary;
    Employee(String n,int e){
        this.name=n;
        this.empid=e;
    } Employee(String n,int e,int sal){
        this.name=n;
        this.empid=e;
        this.salary=sal;
    }
    void display(){
        System.out.println("Emp name:"+name);
        System.out.println("Emp id:"+empid);
        System.out.println("Emp salary:"+salary);
    }

}
public class Program1{
    public static void main(String args[]){
Employee obj=new Employee("arya",24,26000);
Employee obj1=new Employee("bhat",25,22000);
obj.display();
obj1.display();
    }
}
