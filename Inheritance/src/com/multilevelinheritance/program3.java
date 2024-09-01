package com.multilevelinheritance;
class animal{
    void makesound(){
        System.out.println("making sound");
    }
}
class bird extends animal{
    void makesound(){
        super.makesound();
        System.out.println("making bird sound");
    }
}
class parrot extends bird{
    void makesound(){
        super.makesound();
        System.out.println("parrot making sound");
    }
}
public class program3 {
    public static void main(String args[]){
   parrot obj=new parrot();
   obj.makesound();
    }
}
