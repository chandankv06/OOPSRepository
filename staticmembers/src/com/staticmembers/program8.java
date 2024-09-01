package com.staticmembers;
class app{
    static float version=1.0f;
    static void printversion(){
        System.out.println(version);
    }
}
public class program8 {
    public static void main(String args[]){
        app.printversion();
    }
}
