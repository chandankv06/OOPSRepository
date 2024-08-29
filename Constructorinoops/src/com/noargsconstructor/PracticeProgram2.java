package com.noargsconstructor;
class Product{
    int orderno;
    String brandname;
    int quantity;
    String customername;
    Product(){
        orderno=23;
        brandname="samsung";
        quantity=4;
        customername="manoj";
        System.out.println("order no:"+orderno);
        System.out.println("brand name:"+brandname);
        System.out.println("quantity:"+quantity);
        System.out.println("customer name:"+customername);
    }
}
public class PracticeProgram2 {
    public static void main(String args[]){
        Product obj=new Product();
    }
}
