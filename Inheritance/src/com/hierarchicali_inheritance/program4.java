package com.hierarchicali_inheritance;
class account{
   void displayaccounttype(){
       System.out.println("account type");
    }
}
class savingaccount extends account{
    void displayaccounttype(){
        super.displayaccounttype();
        System.out.println("saving account");
    }
}
class checkingaccount extends account{
    void displayaccounttype(){
        super.displayaccounttype();
        System.out.println("checking account");
    }
}
public class program4 {
    public static void main(String args[]){
        savingaccount obj=new savingaccount();
        checkingaccount ob=new checkingaccount();
        obj.displayaccounttype();
        ob.displayaccounttype();
    }
}
