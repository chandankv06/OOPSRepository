package com.simpleinheritance;
class Animal{
    void makesound(){
        System.out.println("woof");
    }
}
class dog extends Animal{
    void makesound(){
        super.makesound();
        System.out.println("woof");
    }
}
public class program2 {
    public static void main(String args[]){
        dog obj=new dog();
        obj.makesound();


    }
}
