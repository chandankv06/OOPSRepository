package com.staticmembers;
class staticcounter {
    static int number;

    static {
        number = 10;
    }
    static void showinfo() {
        System.out.println(number);
    }
}
    public class program3 {
        public static void main(String args[]){
            staticcounter.showinfo();

        }
    }

