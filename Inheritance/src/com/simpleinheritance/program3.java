package com.simpleinheritance;
class person{
    person(String name,int age){
        System.out.println("person name "+name);
        System.out.println("person age "+age);
        }
    }
 class Student extends person {
     Student(String name, int age) {
         super(name, age);
     }
 }
public class program3 {
    public static void main(String args[]){
        Student student = new Student("John", 20);
    }
    }
