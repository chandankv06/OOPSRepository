package com.noargsconstructor;
class DomesticAnimal{
    String breedname;
    int age;
    String quantityofmilkprovided;
    DomesticAnimal(){
        breedname="jersy";
        age=14;
        quantityofmilkprovided="12 liters";
        System.out.println( breedname+" "+age+" "+quantityofmilkprovided);
    }

}
public class Practiceprogram3 {
    public static void main(String args[]){
        DomesticAnimal obj=new DomesticAnimal();
    }
}
