package com.methods;
 class MethodOverloadingExample {

     public void display() {
         System.out.println("No parameters");
     }

     public void display(int a) {
         System.out.println("Integer parameter: " + a);
     }

     public void display(int a, int b) {
         System.out.println("Two integer parameters: " + a + ", " + b);
     }

     public void display(double a) {
         System.out.println("Double parameter: " + a);
     }

     public void display(String a) {
         System.out.println("String parameter: " + a);
     }

     public class Methodoverloading {
         public static void main(String[] args) {
             MethodOverloadingExample obj = new MethodOverloadingExample();

             obj.display();
             obj.display(10);
             obj.display(10, 20);
             obj.display(10.5);
             obj.display("Hello");
         }
     }

 }
