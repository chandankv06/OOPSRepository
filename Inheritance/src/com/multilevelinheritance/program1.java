package com.multilevelinheritance;
class person{
    void displayinfo(){
        System.out.println("Display information");
    }
}
class employee extends person{
    void displayjob(){
        System.out.println("Display job");
    }
}
class manager extends employee{
    void role(){
        System.out.println("Display role");
    }
}
public class program1  {
    public static void main(String args[]){
        manager obj=new manager();
        obj.role();
        obj.displayinfo();
        obj.displayjob();
    }
}



