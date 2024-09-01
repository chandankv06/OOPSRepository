package com.staticmembers;
class utility{
    static int square(int number){
        return number*number;
    }
}
public class program7 {
    public static void main(String args[]){
        int res=utility.square(7);
        System.out.println(res);
    }
}
