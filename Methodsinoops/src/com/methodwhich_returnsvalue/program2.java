package com.methodwhich_returnsvalue;
class Name{
    String getname(String name){
        return name;
    }
}
public class program2 {
    public static void main(String args[]){
        Name obj=new Name();
       String s= obj.getname("latham");
        System.out.println(s);
    }
}
