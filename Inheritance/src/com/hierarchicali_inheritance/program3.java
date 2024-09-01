package com.hierarchicali_inheritance;
class shape{
    void area(){
        System.out.println("Displaying area");
    }
}
class rectangle extends shape{
    int len,wid;
    rectangle(int l,int w){
        this.len=l;
        this.wid=w;
        System.out.println("displaying area of rectangle "+l*w);
    }
}
class circle extends shape{
    int radius;
    circle(int r){
        this.radius=r;
        System.out.println("displaying area of rectangle "+3.14*r*r);
    }
}
public class program3 {
    public static void main(String args[]){
        rectangle obj=new rectangle(2,4);
        circle ob=new circle(3);

    }
}
