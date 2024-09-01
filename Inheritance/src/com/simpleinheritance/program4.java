package com.simpleinheritance;
class vehicle {
    void start() {
        System.out.println("some action in car");
    }
}
class car extends vehicle{
    void start(){
        super.start();
        System.out.println("car is starting");
    }
}
public class program4 {
    public static void main(String args[]){
         car obj=new car();
         obj.start();
    }
}
