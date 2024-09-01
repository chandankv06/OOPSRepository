package com.multilevelinheritance;
class person3{
    person3(String name,int age){
        System.out.println("person name "+name);
        System.out.println("person age "+age);
    }
}
class employee2 extends person3{
     employee2(String name,int age,int empid){
         super(name,age);
         System.out.println("employee name "+name);
         System.out.println("employee age "+age);
         System.out.println("employee id "+empid);
     }
}
class manager3 extends employee2{
    manager3(String name,int age,int empid,String dep){
        super(name,age,empid);
        System.out.println("employee name "+name);
        System.out.println("employee age "+age);
        System.out.println("employee id "+empid);
        System.out.println("employee department "+dep);
    }
}

public class program5 {
    public static void main(String args[]){
        manager3 obj=new manager3("appu",24,35,"development");

    }
}
