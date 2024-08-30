package com.Metodwithoutretvalue;
class getsum{
    void sum(){
        int sum=0;
     for(int i=1;i<=50;i++) {
         sum += i;
     }
         System.out.println(sum);
    }
}
public class Program1 {
    public static void main(String args[]){
     getsum obj=new getsum();
     obj.sum();
    }
}
