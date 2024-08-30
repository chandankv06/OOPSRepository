package com.methodwhich_returnsvalue;
class sum{
    int getsum(int a,int b){
        int c=a+b;
         return c;
    }
}
public class Program1 {
    public static void main(String args[]){
 sum obj=new sum();
 obj.getsum(5,10);
        System.out.println(obj.getsum(5,10));
    }
}
