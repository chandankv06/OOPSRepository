package com.multilevelinheritance;
class person1{
    void showdetail(){
        System.out.println("Detail of person");
    }
}
class employee1 extends person1{
    void showdetail(){
        super.showdetail();
        System.out.println("detail of employee1");
    }
}
class manager1 extends employee1{
    void showdetail(){
        super.showdetail();
        System.out.println("manager detail");
    }
}
public class program4 {
    public static void main(String args[]){
        manager1 obj=new manager1();
        obj.showdetail();
    }
}
