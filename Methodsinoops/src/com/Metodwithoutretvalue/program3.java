package com.Metodwithoutretvalue;
class table{
    void gettable(){
        int sum=0;
        for(int i=1;i<=10;i++) {
            System.out.println(i*2);
            sum+=i*2;
        }
        System.out.println(sum);
    }
}
public class program3 {
    public static void main(String args[]){
        table obj=new table();
        obj.gettable();
    }
}
