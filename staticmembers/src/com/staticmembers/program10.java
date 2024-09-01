package com.staticmembers;
class person{
    static int population=0;
    person(){
        population++;
    }
    static int getPopulation(){
        return population;
    }
}
public class program10 {
    public static void main(String args[]){
        new person();
        System.out.println(person.getPopulation());
    }
}
