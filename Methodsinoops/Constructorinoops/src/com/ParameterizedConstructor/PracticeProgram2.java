package com.ParameterizedConstructor;
class Human2{
    String name;
    int age;
    String location;
    Human2(String n, int a, String l) {
        this.name = n;
        this.age = a;
        this.location = l;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
    }
}
public class PracticeProgram2 {
    public static void main(String[] args) {
        Human2 obj = new Human2("Bharath", 18, "Davangere");
        obj.display();
    }
}
