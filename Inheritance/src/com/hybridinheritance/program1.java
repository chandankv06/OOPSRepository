package com.hybridinheritance;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal {
    void eat() {
        System.out.println("Mammal is eating");
    }
}
class Bird extends Animal {
    void eat() {
        System.out.println("Bird is pecking at food");
    }
}
class Bat extends Mammal {
    void fly() {
        System.out.println("Bat is flying");
    }
}
public class program1 {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
