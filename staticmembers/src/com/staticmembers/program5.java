package com.staticmembers;
class student{
    static int totalstudent;
    student(){
        totalstudent=totalstudent+1;
    }
    static int getTotalstudent(){
        return totalstudent;
    }
}
public class program5 {
    public static void main(String args[]){
        new student();
        new student();
        System.out.println(student.getTotalstudent());

    }
}
