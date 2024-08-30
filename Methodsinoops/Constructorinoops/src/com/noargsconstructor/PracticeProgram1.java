package com.noargsconstructor;
class Human {
    String name;
    int age;
    long phno;
    Human(){
        name="Abhishek";
        age=21;
        phno=8795642309L;
        System.out.println(name+" "+age+" "+phno);
    }
}
public class PracticeProgram1 {
    public static void main(String args[]){
    Human obj=new Human();
    }
}
