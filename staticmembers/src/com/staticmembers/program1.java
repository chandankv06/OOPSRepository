package com.staticmembers;
class greeting{
    static void printgreetings(){
        System.out.println("hello world");
    }
}
public class program1 {
    public static void main(String args[]){
       greeting.printgreetings();
    }
}
