package com.staticmembers;
class calculator{
    static int multiply(int a,int b){
        int res=a*b;
        return res;
    }
}
public class program2 {
    public static void main(String args[]){
int result=calculator.multiply(5,5);
        System.out.println(result);
    }
}
