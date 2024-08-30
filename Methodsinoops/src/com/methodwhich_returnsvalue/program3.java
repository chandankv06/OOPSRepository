package com.methodwhich_returnsvalue;
class Addition{
    int[] getaddition(int x[],int y[]){
        int[] result= new int[x.length];
        for(int i=0;i<x.length;i++){
            result[i]=x[i]+y[i];
        }
        return result;
    }
}
public class program3 {
    public static void main(String args[]){
        int[] x={5,5,5};
        int[] y={15,15,15};
        Addition obj=new Addition();
        int[] res=obj.getaddition(x,y);
        System.out.println(res);
       for(int a:res){
           System.out.println(a);
       }
    }
}
