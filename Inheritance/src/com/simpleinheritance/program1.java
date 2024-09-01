package com.simpleinheritance;
class maths1 {
    void addition(int x, int y) {
        System.out.println("addition result " + (x + y));
    }
}
    class maths2 extends maths1 {
        void substraction(int x,int y){
            System.out.println("substraction result "+(x-y));
        }
    }

public class program1 {
    public static void main(String args[]){
        maths2 obj=new maths2();
        obj.addition(5,5);
        obj.substraction(10,5);

    }
}
