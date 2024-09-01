package com.staticmembers;
class counter{
    static int count=0;
    static void increment(){
        count++;
    }
    static int getcount(){
        return count;
    }
}

public class program6 {
    public static void main(String args[]){
           counter.increment();
            counter.increment();
            counter.increment();

        System.out.println(counter.getcount());
    }
}
