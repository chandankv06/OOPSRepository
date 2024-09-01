package com.multilevelinheritance;
class vehicle{
      vehicle(){
          System.out.println("vehicle created");
      }
}
class car extends vehicle{
    car(){
        System.out.println("car created");
    }
}
class electriccar extends car{
    electriccar(){
        System.out.println("electric car created");
    }
}
public class program2 {
    public static void main(String args[]){
        electriccar obj=new electriccar();

    }
}
