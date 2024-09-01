package com.staticmembers;
class mathoperation{
    static int add(int a,int b){
        return a+b;
    }
}
public class program9 {
    public static void main(String args[]){
       int res= mathoperation.add(10,15);
        System.out.println(res);
    }
}
