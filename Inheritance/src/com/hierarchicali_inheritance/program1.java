package com.hierarchicali_inheritance;
class animal{
    void makesound(){
        System.out.println("making sound");
    }
}
class dog extends animal{
    void makesound(){
        super.makesound();
        System.out.println("dog making sound");
    }
}
class cat extends animal{
    void makesound(){
        super.makesound();
        System.out.println("cat making sound");
    }
}
public class program1 {
    public static void main(String rgs[]){
        cat obj=new cat();
        dog ob =new dog();
        ob.makesound();
        obj.makesound();
    }
}
