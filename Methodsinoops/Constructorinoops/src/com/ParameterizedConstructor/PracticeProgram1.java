package com.ParameterizedConstructor;
class Human{
    String name;
    int age;
    String location;
    Human(String n,int a,String l){
        name=n;
        age=a;
        location=l;
        System.out.println(name);
        System.out.println(age);
        System.out.println(location);
    }
}
public class PracticeProgram1 {
    public static void main(String args[]){
        Human obj=new Human("curran",23,"mangalore");
    }
}
