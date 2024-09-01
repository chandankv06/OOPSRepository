package com.simpleinheritance;
class shape{
    void draw(){
        System.out.println("the shape of circle");
    }
}
class circle extends shape{
    void draw(){
        super.draw();
        System.out.println("circle");
    }
}
public class program5 {
    public static void main(String args[]){
       circle obj=new circle();
       obj.draw();
    }
}
