package com.methodwhich_returnsvalue;
class Twoaddition{
    int[][] getaddition(int[][] a,int[][] b){
        int[][] result=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }
}
public class program4 {
public static void main(String args[]){
    int[][] a={{5,5,5},{15,15,15}};
    int[][] b={{20,20,20},{5,5,5}};
      Twoaddition obj=new Twoaddition();
      int[][] res=obj.getaddition(a,b);
    System.out.println(res);
    for(int[] e:res){
        for(int val:e)
        System.out.println(val);
    }
}
}
